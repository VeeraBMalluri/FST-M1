package in.ibm.com.testNgTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
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
		driver.get("https://www.training-support.net/selenium/target-practice");
	}
	
	@Test
	public void test1()
	{
		String title = driver.getTitle();
		System.out.println("Title of the Page is : " +title);
		Assert.assertEquals("Target Practice", title);
		
	}
	@Test
	public void test2()
	{
		WebElement black = driver.findElement(By.className("ui black button"));
		Assert.assertTrue(black.isDisplayed());
		Assert.assertEquals(black.getText(), "black");
	}
	
	@Test(enabled=false)
	public void test3()
	{
		String subheader = driver.findElement(By.xpath("//div[@class='content']/div")).getText();
		System.out.println("Sub header is : " +subheader);
	}
	
	@Test
	public void test4()
	{
		throw new SkipException ("Skip This testcase");
		
	}
	
	@AfterTest
	
	public void aftertest()
	{
		driver.close();
	}
	
}
