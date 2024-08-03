package mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Senario {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		WebElement drop = driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
		Select s = new Select(drop);

		s.selectByValue("Mexico City");

		WebElement drop1 = driver.findElement(By.xpath("//select[@name=\"toPort\"]"));

		Select d = new Select(drop1);

		d.selectByValue("London");

		driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).submit();

		List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr/td[last()]"));
		List<String> l = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			l.add(list.get(i).getText());
		}

		Collections.sort(l);
		l.get(1);

		for (int i = 0; i < l.size(); i++) {

			driver.findElement(
					By.xpath("//table/tbody/tr/td[text()='" + l.get(i) + "']/preceding-sibling::td/child::input"))
					.click();
			break;
		}

		 driver.close();

	}
}
