package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://training-support.net/selenium/simple-form";
		driver.get(url);
		String title = driver.getTitle();
		
		System.out.println("The title of the Page is : " + title);
		
		WebElement FN = driver.findElement(By.id("firstName"));
		
		FN.sendKeys("Veera");
		
		WebElement LN = driver.findElement(By.id("lastName"));
		
		LN.sendKeys("Malluri");
		
		WebElement mail = driver.findElement(By.id("email"));
		
		mail.sendKeys("veerabm@in.ibm.com");
		
		WebElement ph = driver.findElement(By.id("number"));
		
		ph.sendKeys("9900990099");
		
		WebElement Submit = driver.findElement(By.cssSelector("input.green"));
		
		Submit.click();
		
		Thread.sleep(10000);
		
		driver.close();
		

	}

}
