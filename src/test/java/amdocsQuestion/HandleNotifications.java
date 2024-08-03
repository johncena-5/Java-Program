package amdocsQuestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleNotifications {

	public static void main(String[] args) {
		
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(o);
		driver.get("");

	}

}
