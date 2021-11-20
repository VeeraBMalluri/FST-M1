package Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 
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
	public void calc()
	{
		driver.findElement(By.id("digit_3")).click();;
		driver.findElement(By.id("op_mul")).click();
		driver.findElement(By.id("digit_7")).click();
		String resul = driver.findElement(By.id("result")).getText();
		System.out.println(resul);
		Assert.assertEquals(resul, "21");
	}
}
