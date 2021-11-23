package in.ibm.com.selProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 
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
	public void test9()
	{
		driver.findElement(By.linkText("All Courses")).click();
		
		driver.findElement(By.linkText("See more...")).click();
		List <WebElement> CourseContent = driver.findElements(By.xpath("//div[@class=\"ld-item-title\"]"));
		System.out.println(CourseContent.size());
		System.out.println("CourseContent1 : " + CourseContent.get(0).getText()); 
		System.out.println("CourseContent2 : " + CourseContent.get(1).getText());
		System.out.println("CourseContent3 : " + CourseContent.get(2).getText()); 
		
		
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}
