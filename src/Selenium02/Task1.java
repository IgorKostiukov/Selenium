package Selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
       // driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("test");
        WebElement pass=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
        pass.sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String title=driver.getTitle();
        String exptitle="Web Orders";
        if(title.equals(exptitle)) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is incorrect");
        }
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
