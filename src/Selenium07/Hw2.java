package Selenium07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hw2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Contact");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement link=driver.findElement(By.xpath("//a[text()='This is a Ajax link']"));
        link.click();

        String text=driver.findElement(By.xpath("//div[@class = 'ContactUs']/p")).getText();
        System.out.println(text);

        driver.quit();
    }
}
