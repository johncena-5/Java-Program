package sample;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
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

public class BrokenLink {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> listoflink = driver.findElements(By.xpath("//a"));
		ArrayList<String> validlink = new ArrayList<>();
		ArrayList<String> brokenlink = new ArrayList<>();

		for (WebElement str : listoflink) {

			String link = str.getAttribute("href");
			if (link != null) {
				if (link.contains("http")) {
					validlink.add(link);
				} else {
					brokenlink.add(link);
				}
			} else {
				brokenlink.add(link);
			}
		}
		for (String str : validlink) {

			URL url = new URL(str);
			URLConnection con = url.openConnection();
			HttpURLConnection httpurl = (HttpURLConnection) con;
			int code = httpurl.getResponseCode();
			String msg = httpurl.getResponseMessage();
			if (code > 400) {
				brokenlink.add(msg + " " + code);
			}
		}
		System.out.println(listoflink.size()+" "+validlink.size()+" "+brokenlink.size());
	}
}
