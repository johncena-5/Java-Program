package naveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolltip {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-01/11/2023_BOM-DEL-07/11/2023&tripType=R&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement pop = driver.findElement(By.xpath("//span[@class=\"bgProperties icon20 overlayCrossIcon\"]"));
		pop.click();

		WebElement tool = driver.findElement(By.xpath("//span[.=\"Armed Forces\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(tool).perform();
		WebElement tip = driver.findElement(By.xpath(
				"//div[@class=\"makeFlex hrtlCenter whiteText boldFont appendBottom5\"]/following-sibling::p[starts-with(text(),'Applicable for')]"));

		System.out.println(tip.getText());

	}
}
