package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String url = "https://training-support.net/selenium/dynamic-controls";
		driver.get(url);
		System.out.println(driver.getTitle());
		
		WebElement e1 = driver.findElement(By.xpath("//input[@type='text']"));
		
		System.out.println(e1.isEnabled());
		
		WebElement e2 = driver.findElement(By.id("toggleInput"));
		e2.click();
		
		System.out.println(e1.isEnabled());
		
		driver.close();
	}
}