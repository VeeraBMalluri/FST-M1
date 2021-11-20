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
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import junit.framework.Assert;

public class Activity5 
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
	    caps.setCapability("appPackage", "com.google.android.apps.messaging");
	    caps.setCapability("appActivity", ".ui.ConversationListActivity");
	    caps.setCapability("noReset", true);
	     
	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
	    driver = new AndroidDriver<MobileElement>(remoteUrl,caps);
	    wait = new WebDriverWait(driver, 10);
	}
	
	@Test
	
	public void sendmsg () throws InterruptedException 
	
	{
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/start_new_conversation_button\")")));
		driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/start_new_conversation_button\")")).click();
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/recipient_text_view\")")));
		driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/recipient_text_view\")")).sendKeys("9900394955");
		
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(5000);
		
		//wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/compose_message_text\")")));
		//driver.findElement(MobileBy.AndroidUIAutomator("resouceId(\"com.google.android.apps.messaging:id/compose_message_text\")")).sendKeys("Hello from Appium");
		driver.findElement(By.xpath("//android.widget.EditText[@text = \"Text message\"]")).sendKeys("Hello from Appium");
		
		driver.findElement(MobileBy.AndroidUIAutomator("description(\"Send SMS\")")).click();
		
        String messageLocator = "resourceId(\"com.google.android.apps.messaging:id/message_text\")";
    	
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(messageLocator)));
		
        String sentMessageText = driver.findElement(MobileBy.AndroidUIAutomator(messageLocator)).getText();
	
        Assert.assertEquals(sentMessageText, "Hello from Appium");
		
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
	
}
