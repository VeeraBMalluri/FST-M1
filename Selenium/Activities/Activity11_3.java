package in.ibm.com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 
{

	public static void main(String[] args) 
	
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.training-support.net/selenium/javascript-alerts";
		driver.get(url);
		driver.manage().window().maximize();
		
		System.out.println("The title of the page is : " + driver.getTitle());
		
		driver.findElement(By.id("prompt")).click();
		
		Alert newAlert = driver.switchTo().alert();
		
		System.out.println(newAlert.getText());
		newAlert.sendKeys("Yes, you are!");
		newAlert.accept();
		
		driver.close();

	}

}
