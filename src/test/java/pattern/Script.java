package pattern;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script {
	@Test
	public void myntra() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//a[@data-group=\"men\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[.='Sweaters']")).click();
		driver.findElement(By.xpath("//img[contains(@src,\"381633502646109-1.jpg\")]")).click();
		String parentId = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String str : child) {
			driver.switchTo().window(str);
		}
		driver.findElement(By.xpath("//p[text()='M']")).click();
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		driver.findElement(By.xpath("//div[contains(@class,\"itemComponents-base-invisibleBackDrop\")]")).click();
		driver.findElement(By.xpath("//button[.='REMOVE']")).click();
		driver.findElement(By.xpath("//div[contains(@role,\"dialog\")]/descendant::button[text()='REMOVE']")).click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
