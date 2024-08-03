package mock;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableImage {

	public static void main(String[] args) {
		
		ChromeOptions o = new ChromeOptions();
		HashMap<String, Object> images = new HashMap<>();
		images.put("images", 2);
		HashMap<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values", images);
		o.setExperimentalOption("prefs", prefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(o);
		driver.get("https://www.jiomart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
