package Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity3 
{
AppiumDriver<MobileElement> driver;
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "TestMob");
    	caps.setCapability("platformName", "android");
    	caps.setCapability("automationName", "UiAutomator2");
    	caps.setCapability("appPackage", "com.android.calculator2");
    	caps.setCapability("appActivity", "com.android.calculator2.Calculator");
    	caps.setCapability("noReset", true);
    	
    	URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
    	driver = new AndroidDriver<MobileElement>(remoteUrl,caps);
	}
	
	@Test
	public void calc1()
	{
		driver.findElement(By.id("digit_5")).click();;
		driver.findElement(By.id("op_add")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElementById("eq").click();
		
		String resul = driver.findElement(By.id("result")).getText();
		System.out.println(resul);
		Assert.assertEquals(resul, "14");
	}
	
	@Test
	public void calc2()
	{
		driver.findElement(By.id("digit_1")).click();
		driver.findElement(By.id("digit_0")).click();
		driver.findElement(By.id("op_sub")).click();
		driver.findElement(By.id("digit_5")).click();
		driver.findElementById("eq").click();
		
		String resul = driver.findElement(By.id("result")).getText();
		System.out.println(resul);
		Assert.assertEquals(resul, "5");
		
	}
	
	@Test
	public void calc3()
	{
		driver.findElement(By.id("digit_5")).click();
		driver.findElement(By.id("op_mul")).click();
		driver.findElement(By.id("digit_1")).click();
		driver.findElement(By.id("digit_0")).click();
		driver.findElement(By.id("digit_0")).click();
		driver.findElementById("eq").click();
		
		String resul = driver.findElement(By.id("result")).getText();
		System.out.println(resul);
		Assert.assertEquals(resul, "500");
	}
	
	@Test
	public void calc4()
	{
		driver.findElement(By.id("digit_5")).click();
		driver.findElement(By.id("digit_0")).click();
		driver.findElement(By.id("op_div")).click();
		driver.findElement(By.id("digit_2")).click();
		driver.findElementById("eq").click();
		
		String resul = driver.findElement(By.id("result")).getText();
		System.out.println(resul);
		Assert.assertEquals(resul, "25");
	}
	
@AfterClass
	
	public void end ()
	{
		driver.quit();
	}
}

