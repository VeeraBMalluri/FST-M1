package in.ibm.com.selProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity7 
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
	public void test7()
	{
		driver.findElement(By.linkText("All Courses")).click();
		List<WebElement> courses = driver.findElements(By.xpath("//h3[@class= \"entry-title\"]"));
		int total = courses.size();
		System.out.println("Total no of Courses are : "+total);
		System.out.println("Courses names are : ");
		for (WebElement i: courses)
		{
			System.out.println(i.getText());
		}
		
		
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}
