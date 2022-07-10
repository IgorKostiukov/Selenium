package Selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Igor");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kostiukov");
        driver.findElement(By.id("customer.address.street")).sendKeys("Roka street");
        driver.findElement(By.id("customer.address.city")).sendKeys("PCB");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("32408");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("85023145658");
        driver.findElement(By.id("customer.ssn")).sendKeys("742325656");
        driver.findElement(By.id("customer.username")).sendKeys("Samba");
        driver.findElement(By.id("customer.password")).sendKeys("Chacha");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Chacha");
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
       // Thread.sleep(5000);
        driver.quit();
    }
}
