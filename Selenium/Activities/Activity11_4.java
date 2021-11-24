package in.ibm.com.Selenium;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String url = "https://www.training-support.net/selenium/tab-opener";
		driver.get(url);
		driver.manage().window().maximize();
		
		System.out.println("The title of the Page is : "+ driver.getTitle() + "And the Handle is :" +driver.getWindowHandle());
		
		driver.findElement(By.id("launcher")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set <String> handles = driver.getWindowHandles();
		
		for (String handle : handles) 
		{
			System.out.println(handle);
			driver.switchTo().window(handle);
		}
		
		wait.until(ExpectedConditions.titleIs("Newtab"));
		
		System.out.println("Title of the new tab is :" + driver.getTitle());
		
		Thread.sleep(10000);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("actionButton"))));
		
		driver.findElement(By.id("actionButton")).click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		Set <String> handles2 = driver.getWindowHandles();
		
		for (String handle : handles2) 
		{
			System.out.println(handle);
		}
		
		driver.quit();
	}

}
