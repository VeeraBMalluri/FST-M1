package in.ibm.com.selProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 
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
	public void test8()
	{
		driver.findElement(By.linkText("Contact")).click();
		driver.findElement(By.xpath("//input[@id = \"wpforms-8-field_0\"]")).sendKeys("Veera");
		driver.findElement(By.xpath("//input[@id = \"wpforms-8-field_1\"]")).sendKeys("test@example.com");
		driver.findElement(By.xpath("//input[@id = \"wpforms-8-field_3\"]")).sendKeys("Welcome");
		driver.findElement(By.xpath("//textarea[@id = \"wpforms-8-field_2\"]")).sendKeys("Thanks");
		driver.findElement(By.xpath("//button[@id=\"wpforms-submit-8\"]")).click();
		
		String confmsg = driver.findElement(By.xpath("//div[@id=\"wpforms-confirmation-8\"]/p")).getText();
		System.out.println(confmsg);
		Assert.assertEquals(confmsg, "Thanks for contacting us! We will be in touch with you shortly.");
		
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}
