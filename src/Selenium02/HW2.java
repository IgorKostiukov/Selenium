package Selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Asssad");
        driver.findElement(By.name("lastname")).sendKeys("Bala");
        driver.findElement(By.name("reg_email__")).sendKeys("asfdfgas@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("asfdfgas@gmail.com");

        driver.findElement(By.id("password_step_input")).sendKeys("asdasdaasf12");

       driver.findElement(By.id("month")).sendKeys("Sep");

       driver.findElement(By.id("day")).sendKeys("20");

       driver.findElement(By.id("year")).sendKeys("1987");
        driver.findElement(By.cssSelector("input._8esa[value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.close();
        Thread.sleep(5000);
        driver.quit();
    }
}
