package Selenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement login=driver.findElement(By.id("txtUsername"));
        login.sendKeys("Admin");

        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        WebElement but=driver.findElement(By.id("btnLogin"));
        but.click();
        WebElement logoPresent=driver.findElement(By.xpath("//img[@alt ='OrangeHRM']"));
        System.out.println(logoPresent.isDisplayed());
        driver.quit();
    }
}
