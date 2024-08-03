package InterviewQuestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EaseMyTrip {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://flight.easemytrip.com/FlightList/Index?srch=DEL-Delhi-India|BOM-Mumbai-India|23/09/2023"
				+ "&px=1-0-0&cbn=0&ar=undefined&isow=true&isdm=true&lang=en-us&utm_campaign=788997081&utm_source=g_"
				+ "c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gclid=CjwKCAjwsKqoBhBPEiwALrrqiMqrL58y"
				+ "7KVA5oxM5CYaPKGAPavf7CMZpPSymvKISAgHAwYrLDabdhoCU-IQAvD_BwE&IsDoubleSeat=false&CCODE=IN&curr=INR&apptype=B2C");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> x = driver.findElements(By.xpath("//span[@class=\"txt-r4 ng-binding\"]"));
		List<WebElement> y = driver.findElements(By.xpath(
				"//div[@class=\"col-md-2 col-sm-2 col-xs-4 top5 \"]/child::span[@class=\"txt-r2-n ng-binding\"]"));
		List<WebElement> z = driver.findElements(By.xpath("//span[@class=\"dura_md ng-binding\"]"));
		List<WebElement> a = driver.findElements(By.xpath(
				"//div[@class=\"col-md-2 col-sm-2 col-xs-3 top5 txdir\"]/child::span[@class=\"txt-r2-n ng-binding\"]"));
		List<WebElement> b = driver
				.findElements(By.xpath("//div[@class=\"col-md-8 col-sm-8 col-xs-9 txt-r6-n exPrc ng-binding\"]"));
		List<WebElement> c = driver.findElements(By.xpath("//button[@class=\"btn book-bt-n ng-scope\"]"));
		
		List<WebElement> d = driver.findElements(By.xpath("//span[@class=\"txt-r5\"]"));
		for (int i = 0; i < x.size(); i++) {
			
			System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", x.get(i).getText(), y.get(i).getText(), z.get(i).getText(),
					a.get(i).getText(), b.get(i).getText(),c.get(i).getText());

			System.out.printf("%-10s\n", d.get(i).getText());
		}
		 driver.close();
		
	}
}
