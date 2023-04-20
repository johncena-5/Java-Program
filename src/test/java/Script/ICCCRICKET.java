package Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCCRICKET {
	
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> data = driver.findElements(By.xpath("//span[@class=\"u-hide-phablet\"]"));
		
		for (WebElement web : data) {
		   System.out.println(web.getText());
		}
	}
	

}
