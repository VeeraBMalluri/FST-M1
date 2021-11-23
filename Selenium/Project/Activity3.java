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

public class Activity3 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
		public void test3()
	{
		List<WebElement> Finfo = driver.findElements(By.xpath("//h3[@class= \"uagb-ifb-title\"]"));
		String Firstinfo = Finfo.get(0).getText();
		Assert.assertEquals("Actionable Training", Firstinfo);
		System.out.println("Title of First info box is " + Firstinfo);
		
	}
	
	@AfterTest
	
	public void aftertest()
	{
		driver.close();
	}
}
