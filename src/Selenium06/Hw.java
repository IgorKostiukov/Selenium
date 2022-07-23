package Selenium06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/bootstrap-iframe.php");

        driver.switchTo().frame("FrameOne");
        WebElement header=driver.findElement(By.xpath("//h1 [@class = 'heading-13']"));


        if(header.getText().equals("Sorry, We Couldn't Find Anything For “Asksn”")){
            System.out.println("Correct header is displayed");

        }
        driver.switchTo().defaultContent();
        driver.switchTo().frame("FrameTwo");
        WebElement but=driver.findElement(By.xpath("//a [@href = '/enroll/apply']/child::div[@class = 'text-block-2']"));
        System.out.println(but.isEnabled());
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
