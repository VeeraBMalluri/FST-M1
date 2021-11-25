package in.ibm.com.testNgTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 
{
	WebDriver  driver;
	
	@BeforeClass
	public void beforeclass()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@onclick = \"signIn()\"]")).click();
		
		String msg = driver.findElement(By.id("action-confirmation")).getText();
		
		Assert.assertEquals("Welcome Back, admin", msg);
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
}
