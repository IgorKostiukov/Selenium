package Selenium01;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rezkify.com");
        driver.navigate().to("https://www.amazon.com");
       driver.manage().window().maximize(); // maximize window
       // driver.manage().window().fullscreen(); // maximize window
       //Thread.sleep(200);
        driver.navigate().back();
        driver.quit();
    }
}
