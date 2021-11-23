package in.ibm.com.selProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 
{
	WebDriver driver ;
	@BeforeTest
	public void beforetest()
	{
		driver = new FirefoxDriver();
		String url = "https://alchemy.hguy.co/lms";
		driver.get(url);
		
	}
	
	@Test
	public void test1()
	{
		String title = driver.getTitle();
		Assert.assertEquals("Alchemy LMS – An LMS Application", title);
		System.out.println("The title of the page is :  "+title);
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}
