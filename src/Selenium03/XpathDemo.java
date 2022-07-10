package Selenium03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Tester");
        WebElement password=driver.findElement(By.xpath("//input[@type ='password']"));
        password.sendKeys("test");
        WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();
        driver.quit();
    }
}
