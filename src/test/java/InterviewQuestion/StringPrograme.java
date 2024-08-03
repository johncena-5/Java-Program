package InterviewQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StringPrograme {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement home = driver.findElement(By.xpath("//a[.='Home & Living']"));

		Actions a = new Actions(driver);
		a.moveToElement(home).perform();
		List<WebElement> ele = driver.findElements(
				By.xpath("//a[.='Home Décor']/parent::li/following-sibling::li/a[@class=\"desktop-categoryLink\"]"));

		List<String> l = new ArrayList<>();
		for (int i = 0; i < ele.size(); i++) {
			l.add(ele.get(i).getText());
		}
		
		l.stream().forEach(e ->System.out.println(e));
	}
}
