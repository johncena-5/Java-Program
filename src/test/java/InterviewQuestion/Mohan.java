package InterviewQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mohan {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//i[@class=\"wewidgeticon we_close\"]")).click();
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[@data-cy=\"LoginFlowPopup_97\"]")).click();
		driver.navigate().back();

		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//i[@class=\"wewidgeticon we_close\"]")).click();
		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		Thread.sleep(5000);

		String flag = "False";

		while (flag == "False") {

			if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]"))
					.size() > 0) {

				driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]"))
						.click();
				flag = "True";
				Thread.sleep(5000);
			}

			else {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}

		}

		System.out.println("Test case is passed");
		driver.close();

	}

}
