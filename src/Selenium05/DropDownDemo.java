package Selenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static String url="https://syntaxprojects.com/basic-select-dropdown-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement daysDD=driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDD);
       //select.selectByIndex(3);
       //select.selectByValue("Wednesday");
        select.selectByVisibleText("Tuesday");
        

    }
}
