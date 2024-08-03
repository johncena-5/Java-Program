package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@aria-label=\"Dismiss sign-in info.\"]")).click();

		driver.findElement(By.id("flights")).click();
		driver.findElement(By.xpath("//button[contains(@data-ui-name,\"input_location_f\")]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Airport or city\"]")).sendKeys("banglore");
		WebElement  e = driver.findElement(By.xpath("//li[contains(@data-ui-name,\"locations\")]"));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(e)).click();
		
		driver.findElement(By.xpath("//button[contains(@aria-describedby,\"location_input_to\")]")).click();
		
		driver.findElement(By.xpath("//div[@id=\"__bui-12\"]/descendant::input")).sendKeys("ranchi");
		driver.findElement(By.xpath("//div[@id=\"__bui-12\"]/descendant::li")).click();
		
		driver.findElement(By.xpath("//button[contains(@data-ui-name,\"button_date\")]")).click();
		
		int fdate=25, fyear=2023;
		String fmonth = "May";
		String from= fdate+" "+fmonth+" "+fyear;
		
		
		boolean flag = false;
		while(flag) {
			
		
		List<WebElement> depart = driver.findElements(By.xpath("//span[@class=\"b21c1c6c83\"]"));
		
		for(int i=0;i<depart.size();i++) {
			
			if(depart.get(i).getAttribute("aria-label").contains(from)) {
				
				driver.findElement(By.xpath(from));
				flag=true;
			}
		}
		
		}
	}

}
