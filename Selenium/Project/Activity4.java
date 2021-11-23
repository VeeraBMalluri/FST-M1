package in.ibm.com.selProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 
{

WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
		public void test4()
	{
		List<WebElement> Finfo = driver.findElements(By.xpath("//h3[@class= \"entry-title\"]"));
		String SecondCourse = Finfo.get(1).getText();
		System.out.println("Title of Second Course is " + SecondCourse);
		Assert.assertEquals("Email Marketing Strategies", SecondCourse);
	}
	
	@AfterTest
	
	public void aftertest()
	{
		driver.close();
	}
}
