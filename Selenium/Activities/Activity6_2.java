package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		String url = "https://training-support.net/selenium/ajax";
		
		driver.get(url);
		
		System.out.println("Title of the page is  - " + driver.getTitle());
		
		WebElement button = driver.findElement(By.xpath("//button[@class= 'ui violet button']"));
		
		button.click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
		String ajaxText = driver.findElement(By.id("ajax-content")).getText();
		
		System.out.println(ajaxText);
		
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		
		String ajaxtext2 = driver.findElement(By.id("ajax-content")).getText();
		
		System.out.println(ajaxtext2);
		
		driver.close();
		
	}

}
