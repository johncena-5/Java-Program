package Script;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	
	@Test
	public void demo() throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> listoflink = driver.findElements(By.tagName("a"));
		List<String> validlink = new ArrayList<>();
		List<String> brokenlink = new ArrayList<>();

		for (WebElement str : listoflink) {
			String link = str.getAttribute("href");
			if (link != null) {
				if (link.contains("http")) {
					validlink.add(link);
				} else {
					brokenlink.add(link + " without http link is added here ");
				}
			} else {
				brokenlink.add(link + "null link is added here ");
			}
		}

		for (String str : validlink) {

			URL url = new URL(str);
			URLConnection con = url.openConnection();
			HttpURLConnection httpcon = (HttpURLConnection) con;
			int responseCode = httpcon.getResponseCode();
			String responseMsg = httpcon.getResponseMessage();
			if (responseCode >= 400) {
				brokenlink.add(responseMsg + responseCode);
			}
		}
		System.out.println(listoflink.size());
		System.out.println(validlink);
		for(int i=0; i<validlink.size(); i++) {
			System.out.println(validlink.get(i).toString());
		}
		System.out.println(brokenlink.size());
	}

}
