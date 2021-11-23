package in.ibm.com.selProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver = new FirefoxDriver();
		String url = "https://alchemy.hguy.co/lms";
		driver.get(url);
	}
	
	@Test
	public void test2()
	{
		String Head1 = driver.findElement(By.xpath("//h1")).getText();
		Assert.assertEquals("Learn from Industry Experts", Head1);
		System.out.println("Heading 1 is : " +Head1);
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}
