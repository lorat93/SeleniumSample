package SampleTest.mySample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void testCaseRegister() {
		System.out.println("Registering");
	}
	
	@Test(dependsOnMethods={"testCaseRegister"})
	public void testCaseLogIn() {
		System.out.println("Logging in");

	}
	
	@Test(dependsOnMethods={"testCaseRegister","testCaseLogIn"})
	public void testCasePasswordChange() {
		System.out.println("Changing password");

	}
	
	@Test
	public void testSelenium(){
			
			WebDriver driver = new SafariDriver();
	
			driver.get("http:\\www.facebook.com");
			
			WebElement element = driver.findElement(By.id("u_0_1"));

			element.sendKeys("Bob");
			
			Assert.assertTrue(element.isDisplayed());
			
			WebElement element2 = driver.findElement(By.id("u_0_d"));
			
			element2.click();
			
			Assert.assertTrue(element2.isSelected());
			
			driver.quit();
		
	}
}