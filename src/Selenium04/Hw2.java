package Selenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Hw2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        int count=0;
        for (WebElement i:links){
            String textLinks=i.getText();
            String linkUrl=i.getAttribute("href");
            if(!textLinks.isEmpty()){
                count++;
                System.out.println(textLinks);
                System.out.println(linkUrl);
            }
        }
        System.out.println("Number of links with text "+count);
        driver.quit();
    }

}
