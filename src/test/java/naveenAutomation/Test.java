package naveenAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		driver.findElement(By.xpath("//li[text()='Round Trip']")).click();

		driver.findElement(By.xpath("//label[@for=\"fromCity\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Delhi");
		List<WebElement> from = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));

		for (int i = 0; i < from.size(); i++) {
			if (from.get(i).getText().contains("Delhi")) {
				from.get(i).click();
				break;
			}
		}

		driver.findElement(By.xpath("//label[@for=\"toCity\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("Mumbai");

		List<WebElement> to = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));

		for (int i = 0; i < to.size(); i++) {
			if (to.get(i).getText().contains("Mumbai")) {
				to.get(i).click();
				break;
			}
		}
		
		
		
		while(true) {
			
		String fromMonth = driver.findElement(By.xpath("//div[@class=\"DayPicker-Month\"]")).getText();
		if(fromMonth.contains("December")) {
			
			List<WebElement> fromDate = driver.findElements(By.xpath("(//div[@class=\"DayPicker-Months\"]/child::div)[1]//descendant::div[contains(@class,\"DayPicker-Day\") and @aria-disabled=\"false\"]"));

			for(int i=0;i<fromDate.size();i++) {
				if(fromDate.get(i).getAttribute("aria-label").contains("01")){
					fromDate.get(i).click();
					break;
				}
			}
			
			
			List<WebElement> returnDate = driver.findElements(By.xpath("(//div[@class=\"DayPicker-Months\"]/child::div)[1]//descendant::div[contains(@class,\"DayPicker-Day\") and @aria-disabled=\"false\"]"));

			for(int i=0;i<returnDate.size();i++) {
				if(returnDate.get(i).getAttribute("aria-label").contains("07")){
					returnDate.get(i).click();	
					break;
				}
			}
			break;
		}else {
			WebElement nextMonth = driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]"));
			if(nextMonth.isDisplayed()) {
				nextMonth.click();
			}else {
				break;
			}
		}
	}
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\"primaryBtn font24 latoBold widgetSearchBtn \"]")).click();
		
		WebElement pop = driver.findElement(By.xpath("//span[@class=\"bgProperties icon20 overlayCrossIcon\"]"));
		if(pop.isDisplayed()) {
			pop.click();
		}else {
			
		}
		
		
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).perform();
		a.sendKeys(Keys.PAGE_DOWN).perform();
		a.sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(5000);
		
		List<WebElement> numOfDepFlight = driver.findElements(By.xpath("(//div[@class=\"paneView\"])[1]/descendant::div[@class=\"listingCardWrap\"]/div/div[not(@class=\"bannersContainer undefined\") and not(@class=\"groupBookingCard split-view collapsed \")]"));
		System.out.println(numOfDepFlight.size());
		
		List<WebElement> numOfReturnFlight = driver.findElements(By.xpath("(//div[@class=\"paneView\"])[2]/descendant::div[@class=\"listingCardWrap\"]/div/div[not(@class=\"bannersContainer undefined\") and not(@class=\"groupBookingCard split-view collapsed \")]"));
		System.out.println(numOfReturnFlight.size());
		
		driver.findElement(By.xpath("(//input[@id=\"listingFilterCheckbox\"])[1]")).click();
		
		
		List<WebElement> numOfDepFlight1 = driver.findElements(By.xpath("(//div[@class=\"paneView\"])[1]/descendant::div[@class=\"bannersContainer undefined\"]/following-sibling::div"));
		System.out.println(numOfDepFlight1.size());
		
		List<WebElement> numOfReturnFlight1 = driver.findElements(By.xpath("(//div[@class=\"paneView\"])[2]/descendant::div[@class=\"bannersContainer undefined\"]/following-sibling::div"));
		System.out.println(numOfReturnFlight1.size());
		
		
		
		driver.close();
	}

}
