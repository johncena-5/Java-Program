package intellijproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class InAmazonFetchThePriceOFPhoneNameAndPhonePriceStoreInExcelThenTakeTheDataFromExcelAndStoreInPropertiesFileAndLastFetchTheDataAndSearchInUserInterface {
//store data in Excel sheet from application

    static WebDriver driver;
    @Test(priority = 0)
    public  void m() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max");
        driver.findElement(By.id("nav-search-submit-button")).click();
        List<WebElement> PhoneName = driver.findElements(By.xpath("//div[@data-component-type=\"s-search-result\"]/descendant::span[contains(@class,\"a-size-medium\")]"));
        List<WebElement> PhonePrice = driver.findElements(By.xpath("//div[@data-component-type=\"s-search-result\"]/descendant::span[@class=\"a-price-whole\"]"));

        File file = new File("D:\\ItellijWorkSpace\\WaterSolution\\src\\test\\resources\\config\\PriceOfIphone.xlsx");
        FileInputStream fis = new FileInputStream(file);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("Sheet1");

        System.out.print(PhoneName.size()+" "+PhonePrice.size());
        for (int i = 0; i < PhoneName.size(); i++) {
            sh.createRow(i).createCell(0).setCellValue(PhoneName.get(i).getText());
            sh.getRow(i).createCell(1).setCellValue(PhonePrice.get(i).getText());
        }

        FileOutputStream fos = new FileOutputStream(file);
        wb.write(fos);
        wb.close();

    }
    //fetch data from excel file and store in a map
    @Test(priority = 1)
    public void m1() throws Exception {
        File file = new File("D:\\ItellijWorkSpace\\WaterSolution\\src\\test\\resources\\config\\PriceOfIphone.xlsx");
        FileInputStream fis = new FileInputStream(file);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("Sheet1");
        int row = sh.getLastRowNum();

        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i <= row; i++) {
            String key = sh.getRow(i).getCell(0).getStringCellValue();
            String value = sh.getRow(i).getCell(1).getStringCellValue();
            map.put(key, value);
        }

        m2(map);

    }
    //write data in property file

    public static void m2(Map<String,String>map) throws Exception {

        File file = new File("D:\\ItellijWorkSpace\\WaterSolution\\src\\test\\resources\\config\\commonData.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties properties = new Properties();
        for(Map.Entry<String,String> entry:map.entrySet()){
            properties.put(entry.getValue(),entry.getKey());
        }
        FileOutputStream fos = new FileOutputStream(file);
        properties.store(fos,"Update successfully");
        searchPhone();
    }

    public static void searchPhone() throws IOException, AWTException {

        driver.navigate().to("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        File file = new File("D:\\ItellijWorkSpace\\WaterSolution\\src\\test\\resources\\config\\commonData.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fis);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(properties.getProperty("127999"));
        driver.findElement(By.id("nav-search-submit-button")).click();

    }
}

