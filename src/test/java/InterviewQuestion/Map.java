package InterviewQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Map {

	@Test
	public  void main() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
			
		String fr = driver.findElement(By.xpath("//iframe[contains(@src,\"iframe=1&widget=1&links=0\")]")).getAttribute("id");
		driver.switchTo().frame(fr);
		
		Thread.sleep(4000);

		WebElement cou = driver.findElement(By.xpath("//*[local-name()='path' and @name='Texas']"));
		cou.click();
	
		//driver.close();
	}

}
