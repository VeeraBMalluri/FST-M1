package Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class Activity4 
{
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	@BeforeClass
	
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("deviceName", "TestMob");
	     caps.setCapability("platformName", "android");
	     caps.setCapability("automationName", "UiAutomator2");
	     caps.setCapability("appPackage", "com.android.contacts");
	     caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
	     caps.setCapability("noReset", true);
	     
	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
	    driver = new AndroidDriver<MobileElement>(remoteUrl,caps);
	    wait = new WebDriverWait(driver, 10);
		
	}
	
	@Test
	public void addContact() throws InterruptedException
	{
		driver.findElement(By.id("add_contact_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@text = 'First name']")).sendKeys("Aaditya");
		driver.findElement(By.xpath("//android.widget.EditText[@text = 'Last name']")).sendKeys("Varma");
		driver.findElement(By.xpath("//android.widget.EditText[@text = 'Phone']")).sendKeys("9991284782");
		driver.findElement(By.xpath("//android.widget.Button[@text = 'SAVE']")).click();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(MobileBy.id("header")));
		
		String phnumber = driver.findElement(By.id("header")).getText();
		System.out.println(phnumber);
		Assert.assertEquals("(999) 128-4782", phnumber); 
	}
	
	@AfterClass
	
	public void close()
	
	{
		driver.quit();
	}

}
