package in.ibm.com.selProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity6 
{
		
WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
		public void test6a()
	{
		driver.findElement(By.linkText("My Account")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "My Account – Alchemy LMS");
		
	}
	
	@Test 
	public void test6b()
	{
		driver.findElement(By.linkText("Login")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.xpath("//p[@id ='backtoblog']/a")).click();
		String user = driver.findElement(By.className("display-name")).getText();
		System.out.println("The User name is :" +user);
		Assert.assertEquals(user, "root");
	}
	
	@AfterTest
	
	public void aftertest()
	{
		driver.close();
	}
}
