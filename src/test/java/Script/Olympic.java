package Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olympic {
	
	@Test
	public void demo() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/athletes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("onetrust-pc-btn-handler")).click();
		driver.findElement(By.xpath("//button[text()='Reject All']")).click();
		
		WebElement plus = driver.findElement(By.xpath("//button[@data-cy=\"more-button\"]"));
//		List<WebElement> row = driver.findElements(By.xpath("//li[@data-cy=\"athlete-row\"]"));
//		for(int i=1; i<row.size();i++) {
//			
//			String list = driver.findElement(By.xpath("//li[@data-row-id=\"all-athletes-table-row-"+i+"\"]")).getText();
//		    
//		    System.out.println(list);
//		    
//		    if(plus.isDisplayed()) {
//		        plus.click();
//		    }else {
//		    	break;
//		    }
//		    
//		    WebDriverWait wait = new WebDriverWait(driver, 10);
//		    WebElement load = driver.findElement(By.xpath("//li[contains(@class,\"styles__LoadingRow\")]"));
//		    wait.until(ExpectedConditions.invisibilityOf(load));
//		    row = driver.findElements(By.xpath("//li[@data-cy=\"athlete-row\"]"));
//		    
//		}
		
		WebElement element = driver.findElement(By.xpath("//div[@data-cy=\"nocs-filter\"]/descendant::select"));
		Select select = new Select(element);
		select.selectByValue("IND");
		List<WebElement> row = driver.findElements(By.xpath("//li[@data-cy=\"athlete-row\"]"));
		for(int i=1; i<=row.size();i++) {
			
			String list = driver.findElement(By.xpath("//li[@data-row-id=\"all-athletes-table-row-"+i+"\"]")).getText();
			System.out.println(list);
			if(plus.isDisplayed()) {
	      		plus.click();
			}else {
			row = driver.findElements(By.xpath("//li[@data-cy=\"athlete-row\"]"));
			}
		}
		
		
	}
}
