package browserStack;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStack {
		
	public static final String USERNAME = "warisansari_vJTtFW";
	public static final String AUTOMATE_KEY = "u7yaYnHWYG17oC52hjyz";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static void main(String[] args) throws Exception {
	DesiredCapabilities caps = new DesiredCapabilities();

	caps.setCapability("os", "Windows");
	caps.setCapability("os_version", "10");
	caps.setCapability("browser", "Chrome");
	caps.setCapability("browser_version", "81");
	caps.setCapability("name", "nehapramodvaidya1's First Test");

	WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	// Navigating through the URL
	driver.get("http://www.google.com");
	//Locating the search box of google
	WebElement element = driver.findElement(By.name("q"));
	// Sending browserstack keyword for search
	element.sendKeys("BrowserStack");
	element.submit();

	System.out.println(driver.getTitle());
	driver.quit();
	}
	}
