package Project;

import java.net.MalformedURLException;
import java.net.URL;

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

public class Activity6 
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
    	caps.setCapability("appPackage", "com.android.chrome");
    	caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
    	caps.setCapability("noReset", true);
    	
    	URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
    	driver = new AndroidDriver<MobileElement>(remoteUrl,caps);
    	wait = new WebDriverWait(driver, 20);

        driver.get("https://www.training-support.net/selenium");
    }
    
    @Test
    public void act6Test1 () throws InterruptedException
    {
    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View")));
    	
    	driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(5).scrollIntoView(textContains(\"Popups\"))")).click();
        Thread.sleep(5000);
        
        driver.findElement(MobileBy.xpath("//android.view.View[1]/android.view.View[4]/android.widget.Button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@resource-id= \"username\"]"))).sendKeys("admin");
        driver.findElement(MobileBy.xpath("//android.widget.EditText[@resource-id= \"password\"]")).sendKeys("password");
        driver.findElement(MobileBy.xpath("//android.widget.Button[@text= \"Log in\"]")).click();
        
        String success = wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[@text = \"Welcome Back, admin\"]"))).getText();      
        Assert.assertEquals(success, "Welcome Back, admin");
    }
    
    @Test
    public void act6Test2() throws InterruptedException
    {
    	 Thread.sleep(3000);
         
         driver.findElement(MobileBy.xpath("//android.view.View[1]/android.view.View[5]/android.widget.Button")).click();
         wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@resource-id= \"username\"]"))).sendKeys("admin");
         driver.findElement(MobileBy.xpath("//android.widget.EditText[@resource-id= \"password\"]")).sendKeys("passw0rd");
         driver.findElement(MobileBy.xpath("//android.widget.Button[@text= \"Log in\"]")).click();
         
         String fail = wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[@text = \"Invalid Credentials\"]"))).getText();      
         Assert.assertEquals(fail, "Invalid Credentials");
    }
    
    @AfterClass 
    public void close()
    
    {
    	driver.quit();
    }
}
