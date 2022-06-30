package Selenium02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        String exptitle= "Amazon.com. Spend less. Smile more.";
        if(title.equals(exptitle)) {
            System.out.println("title is correct");
        } else {
        System.out.println("Title is incorrect");
    }
        driver.quit();
    }
}
