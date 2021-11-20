package Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 
{
	WebDriverWait wait;
	AppiumDriver<MobileElement> driver;
	@BeforeClass
	
	public void setup() throws MalformedURLException
	{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("deviceName", "TestMob");
    	caps.setCapability("platformName", "android");
    	caps.setCapability("automationName", "UiAutomator2");
    	caps.setCapability("appPackage", "com.android.chrome");
    	caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
    	caps.setCapability("noReset", true);
    	
    	URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
    	driver = new AndroidDriver<MobileElement>(remoteUrl,caps);
    	wait = new WebDriverWait(driver, 10);
	}
	
	@Test
	
	public void test1() throws InterruptedException
	{
		driver.get("https://www.training-support.net/");
		Thread.sleep(5000);
		String pageTitle = driver.findElement(By.xpath("//android.view.View[@text='Training Support']")).getText();
		System.out.println("The title of the Page is :" + pageTitle);
		
		driver.findElement(By.xpath("//android.view.View[@text='About Us']")).click();
		Thread.sleep(5000);
		String newPageTitle = driver.findElement(By.xpath("//android.view.View[@text='About Us']")).getText();
		System.out.println("The new page title is : " +newPageTitle);
		
        Assert.assertEquals(pageTitle, "Training Support");
        
    	Assert.assertEquals(newPageTitle, "About Us");	
	}
	
	@AfterClass
	
	public void end ()
	{
		driver.quit();
	}
}
