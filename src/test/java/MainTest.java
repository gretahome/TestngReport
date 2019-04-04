import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {
    WebDriver driver;
    String URLLink = "http://www.google.com";

    @BeforeMethod
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","C:\\\\Libs\\\\chromedriver.exe");
        driver  = new ChromeDriver();

    }

    @AfterMethod
    public void tearDown () {
        System.out.println("start excute quit driver");
        try{
            driver.quit();

        }catch ( Exception e ){
            System.out.println("driver quit error please check");


        }
        System.out.println("driver already quit");


    }

    @Test
    public void drivertest () {
        driver.get(URLLink);
        WebElement e = driver.findElement(By.name("q"));
        e.sendKeys("maven testng");
        e.submit();

    }
    @Test
    public void linktest () {
        driver.get(URLLink);
        WebElement e = driver.findElement(By.name("q"));
        e.sendKeys("7 rings");
        e.submit();

    }
}