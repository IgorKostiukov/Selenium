package Selenium06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement but1=driver.findElement(By.xpath("//button[@class = 'btn btn-default']"));
        but1.click();
        Thread.sleep(1500);
        Alert ok=driver.switchTo().alert();
        ok.accept();
        Thread.sleep(1500);
        but1=driver.findElement(By.xpath("//button[@onclick = 'myConfirmFunction()']"));
        but1.click();
        Thread.sleep(1500);
        ok=driver.switchTo().alert();
        ok.accept();
        Thread.sleep(1500);
        but1=driver.findElement((By.xpath("//button[@onclick = 'myPromptFunction()']")));
        but1.click();
        Thread.sleep(1500);
        ok=driver.switchTo().alert();
        ok.sendKeys("Helloasda");
        Thread.sleep(1500);
        ok.dismiss();
        Thread.sleep(1500);
        driver.quit();

    }
}
