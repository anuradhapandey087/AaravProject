package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
//BaseClass for selenium
    public void initialization()
    {
        String driverpath="C:\\Users\\ANKIT\\Desktop\\WebDriver\\chromedriver_v83.exe";
        System.setProperty("webdriver.chrome.driver",driverpath);
        driver=new ChromeDriver();
        driver.get("https://legs11.co.uk");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

    }

}
