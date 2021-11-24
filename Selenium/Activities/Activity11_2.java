package in.ibm.com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.training-support.net/selenium/javascript-alerts";
		driver.get(url);
		driver.manage().window().maximize();
		
		System.out.println("The title of the page is : " + driver.getTitle());
		
		driver.findElement(By.id("confirm")).click();
		
		Alert confAlert = driver.switchTo().alert();
		
		System.out.println("Alert Message is : " + confAlert.getText());
		confAlert.accept();
		
		driver.findElement(By.id("confirm")).click();
		confAlert.dismiss();
		
		driver.close();

	}

}
