package Project;

import java.net.MalformedURLException;
import java.net.URL;
//import java.util.List;


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


public class Activity4 

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
    public void activity4() throws InterruptedException 
    {
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View")));
        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(5).scrollIntoView(textContains(\"To-Do List\"))")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.EditText[@resource-id = \"taskInput\"]"))).sendKeys("Add tasks to list");
        driver.findElement(MobileBy.xpath("//android.widget.Button[@text = \"Add Task\"]")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.EditText[@resource-id = \"taskInput\"]"))).sendKeys("Get number of tasks");
        driver.findElement(MobileBy.xpath("//android.widget.Button[@text = \"Add Task\"]")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.EditText[@resource-id = \"taskInput\"]"))).sendKeys("Clear the list");
        driver.findElement(MobileBy.xpath("//android.widget.Button[@text = \"Add Task\"]")).click();
        Thread.sleep(2000);
        driver.findElement(MobileBy.xpath("//android.view.View[@text= \"Add tasks to list\"]")).click();
        Thread.sleep(2000);
        driver.findElement(MobileBy.xpath("//android.view.View[@text= \"Get number of tasks\"]")).click();
        Thread.sleep(2000);
        driver.findElement(MobileBy.xpath("//android.view.View[@text= \"Clear the list\"]")).click();
        Thread.sleep(2000);
        driver.findElement(MobileBy.xpath("//android.view.View/android.view.View[4]/android.view.View[3]")).click();
        Thread.sleep(2000);
        
        
     
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
