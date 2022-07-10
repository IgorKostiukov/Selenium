package Selenium03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement start=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        start.click();
        Thread.sleep(1000);
        WebElement form=driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a"));
        form.click();
        WebElement msg=driver.findElement(By.xpath("//label[text()='Enter message']/following-sibling::input"));
        msg.sendKeys("Hello");
        WebElement show=driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        show.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
