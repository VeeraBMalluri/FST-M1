package Activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

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

        driver.get("https://www.training-support.net/selenium/lazy-loading");
    }

    @Test
    public void Scrolltest() throws InterruptedException 
    {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@text = \"Lazy Loading\"]")));

       
        List<MobileElement> numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
        System.out.println("Number of image shown currently: " + numberOfImages.size());
        
    
        Assert.assertEquals(numberOfImages.size(), 2);
        
        
        Thread.sleep(10000);
        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollTextIntoView(\"helen\")"));
        
     
        numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
        System.out.println("Number of image shown currently: " + numberOfImages.size());
        
     
        Assert.assertEquals(numberOfImages.size(), 2);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}