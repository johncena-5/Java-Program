package amdocsQuestion;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLink {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		List<String> validLink = new ArrayList<>();
		List<String> brokenLink = new ArrayList<>();
		for (int i = 0; i < allLinks.size(); i++) {
			String link = allLinks.get(i).getAttribute("href");
			if (link != null) {
				if (link.contains("http")) {
					validLink.add(link);
				} else {
					brokenLink.add(link);
				}
			} else {
				brokenLink.add(link);
			}
		}
		System.out.println(validLink);

		for(String obj :validLink){

			URL u = new URL(obj);
			URLConnection url = u.openConnection();
			HttpURLConnection urlCon = (HttpURLConnection) url;
			String Msg = urlCon.getResponseMessage();
			int code = urlCon.getResponseCode();
			if (code > 400) {
				brokenLink.add(obj + " " + Msg);
			}
		}
	}
}
