package Selenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement login=driver.findElement(By.id("txtUsername"));
        login.sendKeys("Admin");
        WebElement but=driver.findElement(By.id("btnLogin"));
        but.click();
        WebElement error= driver.findElement(By.xpath("//span[@id ='spanMessage']"));
        String msg="Password cannot be empty";
        if(error.getText().equals(msg)){
            System.out.println("Message Error  displays correct text: " +msg);
        } else {
            System.out.println("Incortrect");
        }
        driver.quit();
    }
}
