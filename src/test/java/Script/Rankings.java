package Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rankings {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/t20i/batting");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(By.xpath("//td[contains(@class,\"table-body__cell ran\") or contains(@class,\"rankings-block__t\")]"));

		
		for(int i=0;i<list.size();i++) {
			
		System.out.println(list.get(i).getText());
		}
	}

}
