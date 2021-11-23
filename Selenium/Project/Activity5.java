package in.ibm.com.selProj;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 
{
WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
		public void test5()
	{
		driver.findElement(By.linkText("My Account")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "My Account – Alchemy LMS");
		
	}
	
	@AfterTest
	
	public void aftertest()
	{
		driver.close();
	}
}
