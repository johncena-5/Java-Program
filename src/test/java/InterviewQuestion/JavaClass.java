package InterviewQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaClass {

	public static void main(String[] args) throws InterruptedException {

       
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://fortification-uat-ui.s3-website.ap-south-1.amazonaws.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=\"secondary-button small-link\" and @id=\"details-button\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	    System.out.println("Pass: "+driver.getTitle());
	    Thread.sleep(2000);
	    driver.quit();
	}

}
