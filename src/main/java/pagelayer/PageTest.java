package pagelayer;

import base.BaseTest;
import org.openqa.selenium.By;

public class PageTest extends BaseTest {

public static String joinnow="//*[@class='btn register']";
    public static String email="//*[@id='email']";
    public static String username="//*[@id='username']";
    public static String pwd="//*[@id='password']";
    public static String next="//*[@class='next']";



public void RegistrationPage()
{
    driver.findElement(By.xpath(joinnow)).click();
    driver.findElement(By.xpath(email)).sendKeys("anuradhapandey087@gmail.com");
    driver.findElement(By.xpath(username)).sendKeys("Anuradha");
    driver.findElement(By.xpath(pwd)).sendKeys("Anuradha@123");
}
public void HomePage()
{
    driver.findElement(By.xpath(next)).click();
}


}
