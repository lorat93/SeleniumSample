package SampleTest.mySample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		//array to hold inputs
		String[] array = {"http://www.facebook.com","Bob","Alan","a@yahoo.com", "booboo"};
		
		// start on safari browser
		WebDriver driver = new SafariDriver();
		
		// get URL
		driver.get(array[0]);
		
		// First name
		WebElement element = driver.findElement(By.id("u_0_1"));	
		element.sendKeys(array[1]);
		
		// Last name
		WebElement element2 = driver.findElement(By.id("u_0_3"));
		element2.sendKeys(array[2]);
		
		// Email
		WebElement element3 = driver.findElement(By.id("u_0_5"));
		element3.sendKeys(array[3]);
		
		// Repeat Email
		WebElement element4 = driver.findElement(By.id("u_0_8"));
		element4.sendKeys(array[3]);
		
		// Password
		WebElement element5 = driver.findElement(By.id("u_0_a"));
		element5.sendKeys(array[4]);
		
		// Female Button
		driver.findElement(By.id("u_0_d")).click();
		
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Oct");
		
		Select select2 = new Select(driver.findElement(By.id("day")));
		select2.selectByVisibleText("10");
		
		Select select3 = new Select(driver.findElement(By.id("year")));
		select3.selectByVisibleText("1993");
		
		// Submit Button (will have failed)
		driver.findElement(By.id("u_0_i")).click();
		
		// quit
		//driver.quit();
    }
}
