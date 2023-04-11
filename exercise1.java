package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        WebElement firstname=driver.findElement(By.id("input-firstname"));
        firstname.sendKeys("RAJASRI");
        WebElement Lname=driver.findElement(By.id("input-lastname"));
        Lname.sendKeys("G");
        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("727721euit123@skcet.ac.in");
        WebElement pass=driver.findElement(By.id("input-password"));
        pass.sendKeys("123");
        WebElement yes=driver.findElement(By.id("input-newsletter-yes"));
        yes.click();
	}

}
