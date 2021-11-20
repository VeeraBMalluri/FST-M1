package Project;

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
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class Activity1 
{
	
	AppiumDriver<MobileElement> driver ;
    WebDriverWait wait;
    
    @BeforeClass
    public void beforeClass() throws MalformedURLException 
    {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "TestMob");
    	caps.setCapability("platformName", "android");
    	caps.setCapability("automationName", "UiAutomator2");
    	caps.setCapability("appPackage", "com.google.android.apps.tasks");
    	caps.setCapability("appActivity", ".ui.TaskListsActivity");
    	caps.setCapability("noReset", true);
    	
    	URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
    	driver = new AndroidDriver<MobileElement>(remoteUrl,caps);
    	wait = new WebDriverWait(driver, 20);
  
    }
    
    @Test 
    
    public void activity1() throws InterruptedException
    
    {
    	String str1 = "Complete Activity with Google Tasks";
    	String str2 = "Complete Activity with Google Keep";
    	String str3 = "Complete the second Activity Google Keep";
    	
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")));
    	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")).click();
    	
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text = \"New task\"]")));
    	driver.findElement(By.xpath("//android.widget.EditText[@text = \"New task\"]")).sendKeys("Complete Activity with Google Tasks");
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text=\"Save\"]")));
    	driver.findElement(By.xpath("//android.widget.Button[@text=\"Save\"]")).click();
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")));
    	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")).click();
    	
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text = \"New task\"]")));
    	driver.findElement(By.xpath("//android.widget.EditText[@text = \"New task\"]")).sendKeys("Complete Activity with Google Keep");
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text=\"Save\"]")));
    	driver.findElement(By.xpath("//android.widget.Button[@text=\"Save\"]")).click();
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")));
    	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")).click();
    	
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text = \"New task\"]")));
    	driver.findElement(By.xpath("//android.widget.EditText[@text = \"New task\"]")).sendKeys("Complete the second Activity Google Keep");
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text=\"Save\"]")));
    	driver.findElement(By.xpath("//android.widget.Button[@text=\"Save\"]")).click();
    	
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text = \"Complete Activity with Google Tasks\"]")));
    	Thread.sleep(10000);
    	MobileElement act1 = driver.findElement(By.xpath("//android.widget.TextView[@text = \"Complete Activity with Google Tasks\"]"));
    	
    	MobileElement act2 = driver.findElement(By.xpath("//android.widget.TextView[@text = \"Complete Activity with Google Keep\"]"));
    	
    	MobileElement act3 = driver.findElement(By.xpath("//android.widget.TextView[@text = \"Complete the second Activity Google Keep\"]"));
    	
    	
    	Assert.assertEquals(act1.getText(), str1);
    	Assert.assertEquals(act2.getText(), str2);
    	Assert.assertEquals(act3.getText(), str3);
    }
    
    @AfterClass
    public void close()
    {
    	driver.quit();
    }
}
