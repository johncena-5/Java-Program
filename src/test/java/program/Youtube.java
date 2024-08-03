package program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement ele = driver.findElement(By.xpath("//div[@id=\"container\"]/descendant::input[@id=\"search\"]"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\"search\"]"))).sendKeys("samsungs20");

		driver.findElement(By.id("search-icon-legacy")).click();
		String video = "Galaxy S20 in 2023 - Is it worth it?";
		driver.findElement(By.xpath(
				"//ytd-item-section-renderer[contains(@class,\"style-scope\")][last()]/descendant::ytd-video-renderer/descendant::yt-formatted-string[contains(.,'"
						+ video + "')]"))
				.click();
		driver.close();
	}

}
