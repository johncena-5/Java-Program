package intellijproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TakeAllImageFetchTheSrc {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        List<WebElement> listImg = driver.findElements(By.xpath("//img"));
        List<String> list = new ArrayList<>();
        for (int i = 0; i <listImg.size() ; i++) {
            String src = listImg.get(i).getAttribute("src");
            list.add(src);
        }
        System.out.println(list);
    }
}
