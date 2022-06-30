package Selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElems {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fb.com");
        driver.findElement(By.id("email")).sendKeys("asddsag@mail.ru");
        driver.findElement(By.id("pass")).sendKeys("asdasd22318");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement((By.partialLinkText("Forgot"))).click();
        driver.findElement(By.id("identify_email")).sendKeys("8508872354");
        driver.findElement(By.id("did_submit")).click();
    }
}
