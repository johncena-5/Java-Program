package naveenAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckStringContainsVowelOrNot {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> ele = driver.findElements(By.xpath("//input[@name=\"username\"] | //input[@name=\"pwd\"]"));

		for (int i = 0; i < ele.size(); i++) {
			if (ele.get(i).getAttribute("type").contains("text"))
				ele.get(i).sendKeys("admin");
			else
				ele.get(i).sendKeys("manager");
		}
		
	}
}
