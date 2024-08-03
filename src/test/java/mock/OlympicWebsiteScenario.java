package mock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OlympicWebsiteScenario {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("onetrust-accept-btn-handler"))).click();

		List<WebElement> cou = driver
				.findElements(By.xpath("//span[@data-cy=\"country-name\"]"));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i <cou.size(); i++) {

			
			if (cou.get(i).getText().equals("Armenia")) {
				System.out.print(cou.get(i).getText() + " ");

				int j=i+1;
				List<WebElement> d = driver.findElements(By.xpath(
						"//div[@data-medal-id=\"gold-medals-row-" + j + "\" or @data-medal-id=\"silver-medals-row-" + j
								+ "\" or @data-medal-id=\"bronze-medals-row-" + j + "\"]"));
				for (int k = 0; k < d.size(); k++) {
					System.out.print(d.get(k).getText() + " ");
				}
				System.out.println();
				
			}
		}

	}
}
