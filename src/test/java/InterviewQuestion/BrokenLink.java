package InterviewQuestion;

import java.awt.AWTException;
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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	@Test
	public void main() throws AWTException, InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		List<String> ele = new ArrayList<>();
		for (WebElement e : links) {
			String link = e.getAttribute("href");
			ele.add(link);
		}

		long startTime = System.currentTimeMillis();
		ele.parallelStream().forEach(e -> brokenLink(e));
		long endTime = System.currentTimeMillis();

		System.out.println("total time " + (endTime - startTime));
		driver.close();
	}

	public static void brokenLink(String ele) {
		try {
			URL url = new URL(ele);
			URLConnection urlCon = url.openConnection();
			HttpURLConnection httpurl = (HttpURLConnection) urlCon;
			String Msg = httpurl.getResponseMessage();
			int Rescode = httpurl.getResponseCode();
			if (Rescode >= 400) {
				System.out.println(ele + "------->" + httpurl.getResponseMessage() + " broken Link");
			} else {
				System.out.println(ele + "----------->" + httpurl.getResponseMessage());
			}
		} catch (Exception e) {

		}
	}
}
