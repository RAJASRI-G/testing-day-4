package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise2 {
    public static void main(String args[])
    {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver;
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origin=*");
    	driver=new ChromeDriver(co);
    	driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
    	WebElement name=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
    	name.sendKeys("shadow");
    	WebElement email=driver.findElement(By.xpath("//*[@name=\"to_email\"]"));
    	email.sendKeys("shadow@123");
    	WebElement uname=driver.findElement(By.xpath("//*[@name=\"from_name\"]"));
    	uname.sendKeys("solo leveling");
    	WebElement uemail=driver.findElement(By.xpath("//*[@name=\"from_email\"]"));
    	uemail.sendKeys("solo@123");
    	WebElement choice=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
    	choice.click();
    	WebElement msg= driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		msg.sendKeys("WISH YOU A Happy Birthday");
		
		WebElement amt= driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		amt.sendKeys("1000");
//    	WebElement understand=driver.findElement(By.xpath("//*[@name=\"agree\"]"));
//    	understand.click();
//    	 WebElement con = driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
//		 con.submit();
    }
}
