package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Alert;

public class Activity11_1 
{

	public static void main(String[] args) 
	
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.training-support.net/selenium/javascript-alerts";
		driver.get(url);
		driver.manage().window().maximize();
		
		System.out.println("The title of the page is : " + driver.getTitle());
		
		driver.findElement(By.id("simple")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
