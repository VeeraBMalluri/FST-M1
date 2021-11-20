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

public class Activity3 
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
    	caps.setCapability("appPackage", "com.google.android.keep");
    	caps.setCapability("appActivity", ".activities.BrowseActivity");
    	caps.setCapability("noReset", true);
    	
    	URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
    	driver = new AndroidDriver<MobileElement>(remoteUrl,caps);
    	wait = new WebDriverWait(driver, 20);
    	
    }	
    
    @Test
    public void activity3() throws InterruptedException 
    {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"New text note\"]")));
    	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"New text note\"]")).click();
    	
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text = \"Title\"]")));
    	driver.findElement(By.xpath("//android.widget.EditText[@text = \"Title\"]")).sendKeys("This is the title");
    	
    	driver.findElement(By.xpath("//android.widget.EditText[@text =\"Note\"]")).sendKeys("This is the description");
    	
    	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Single-column view\"]")).click();
    	
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//android.widget.TextView[@text = \"Tomorrow morning\"]")).click();
    	
    	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
    	
    	Thread.sleep(5000);
    	String title = driver.findElement(By.xpath("//android.widget.TextView[@text = \"This is the title\"]")).getText();
    	
    	Assert.assertEquals("This is the title", title);
    }
    
    @AfterClass
    
    public void close()
    {
    	driver.quit();
    }

}
