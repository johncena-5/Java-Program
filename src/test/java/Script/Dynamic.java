package Script;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
		wait.until(ExpectedConditions.visibilityOf(ele)).click();
		// driver.findElement(By.xpath("//button[@class=\"ot-pc-refuse-all-handler\"]")).click();

		List<WebElement> list = driver.findElements(By.xpath("//span[@data-cy=\"country-name\"]"));
		//List<WebElement> medals = driver.findElements(By.xpath("//div[@data-cy=\"medal\"]"));
		for (int i = 1; i < list.size(); i++) {

			String country = list.get(i).getText();
			//String medal = medals.get(i).getText();
			String medal = driver.findElement(By.xpath("//div[@data-medal-id=\"total-medals-row-" + i + "\"]"))
					.getText();
			System.out.println(country + " " + medal);

		}
		
		
		
	}
	
}
