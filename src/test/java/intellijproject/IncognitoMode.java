package intellijproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class IncognitoMode {
    public static void main(String[] args) throws IOException {

        //open the incognito mode in browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        List<String> validLinks = new ArrayList<>();
        List<String> brokenLinks = new ArrayList<>();

        for (int i = 0; i < allLinks.size(); i++) {
            String links = allLinks.get(i).getAttribute("href");
            if(links!=null){
                if(links.contains("http")){
                    validLinks.add(links);
                }else{
                    brokenLinks.add(links);
                }
            }else{
                brokenLinks.add(links);
            }
        }

        for (int i = 0; i <validLinks.size() ; i++) {
            URL url = new URL(validLinks.get(i));
            URLConnection urlCon = url.openConnection();
            HttpURLConnection http = (HttpURLConnection)urlCon;
            int code = http.getResponseCode();
            String Msg = http.getResponseMessage();
            if(code>400){
                brokenLinks.add(Msg+" "+code);
            }
        }
        System.out.println(allLinks.size()+" "+validLinks.size()+" "+brokenLinks.size());
        driver.close();
    }
}
