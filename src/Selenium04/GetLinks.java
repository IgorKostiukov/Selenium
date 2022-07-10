package Selenium04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetLinks {
        public static void main (String[]args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.ebay.com");
           List<WebElement> alllinks=driver.findElements(By.tagName("a"));
            System.out.println("Number of links "+alllinks.size());
            for (WebElement  i:alllinks)
            {
                String linktext= i.getText();
                String link=i.getAttribute("href");
                if(!linktext.isEmpty()) {
                    System.out.println(linktext);
                    System.out.println(link);
                }
            }
            driver.quit();

    }
}
