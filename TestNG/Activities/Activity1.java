package in.ibm.com.testNgTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 
{	
		WebDriver driver ;
		
		@BeforeMethod
		public void beforemethod() 
		{
			driver = new FirefoxDriver();
			driver.get("https://www.training-support.net");
		}

		@Test
		public void test1()
		{
			String title = driver.getTitle();
			System.out.println("The title of the page is : "+title);
			
			Assert.assertEquals("Training Support", title);
			driver.findElement(By.linkText("About Us")).click();
			
			String about = driver.getTitle();
			
			Assert.assertEquals("About Training Support", about);

		}
		
		@AfterMethod
		public void aftermethod()
		{
			driver.close();
		}
		

}
