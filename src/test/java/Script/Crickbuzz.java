package Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crickbuzz {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.xpath("//td[@class=\"rankings-block__banner--team-name\" or @class=\"table-body__cell rankings-table__team\"]"));
		List<WebElement> rating = driver.findElements(By.xpath("//td[@class=\"rankings-block__banner--rating u-text-right\" or @class=\"table-body__cell u-text-right rating\"]"));

		List<WebElement> w = driver.findElements(By.xpath("//ul[@class=\"linked-list js-dynamic-list\"]"));
		for(int i=0;i<w.size();i++) {
		System.out.println(w.get(i).getText());
		}
		for(int i=0;i<list.size();i++) {
			
			String country = list.get(i).getText();
			String rat = rating.get(i).getText();
			System.out.println(country+" "+rat);
		}
	}

}
