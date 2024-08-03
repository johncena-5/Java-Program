package mock;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws IOException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver> (driver)
//		.withTimeout(Duration.ofSeconds(10))
//		.pollingEvery(Duration.ofSeconds(2))
//		.ignoring(NoSuchElementException.class);
//		
//		WebElement element = driver.findElement(By.xpath(""));
//		
//		wait.until(new Function<WebDriver, WebElement>(){
//			public WebElement apply(WebDriver driver) {
//				if(element.isDisplayed()) {
//					return element;
//				}else {
//					return null;
//				}
//			}
//		});
		
		
		List<WebElement> list = driver.findElements(By.xpath("//a"));

		ArrayList<String> brokenlink = new ArrayList<>();
		ArrayList<String> validlink = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			String link = list.get(i).getAttribute("href");
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

		for (String obj : validlink) {

			URL url = new URL(obj);
			URLConnection urlCon = url.openConnection();
			HttpURLConnection httpCon = (HttpURLConnection) urlCon;
			String msg = httpCon.getResponseMessage();
			int code = httpCon.getResponseCode();
			if (code > 400) {
				brokenlink.add(msg + " " + code);
			}
		}
		System.out.println(list.size()+" "+validlink.size()+" "+brokenlink.size());
	}
}
