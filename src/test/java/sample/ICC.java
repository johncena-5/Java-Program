package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICC {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> country = driver.findElements(By.xpath("//span[@class=\"u-hide-phablet\"]"));
		List<WebElement> points = driver.findElements(By.xpath("//td[contains(@class,\"table-body__cell u-text\") or contains(@class,\"rankings-block__banner--rating\")]"));
		List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr"));
		
		for(int i=0;i<country.size();i++) {
			
			//WebElement ele = driver.findElement(By.xpath("//span[@class=\"u-hide-phablet\"]/parent::td/following-sibling::td[contains(@class,\"rankings-block__banner--rating u-text-right\")]"));
			//System.out.println(ele.getText());
			
			String c = country.get(i).getText();
			String p = points.get(i).getText();
			String l = list.get(i).getText();
			
			System.out.println(l);
		}

	}

}
