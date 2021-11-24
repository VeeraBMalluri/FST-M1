package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.training-support.net";
		driver.get(url);
		String pageTitle = driver.getTitle();
		
		System.out.println("The title of page is " + pageTitle);
		
		WebElement op1 = driver.findElement(By.id("about-link"));
		
		String des = op1.getText();
		
		System.out.println("Text in about Us Web Element using id : " + des);
		
		//Thread.sleep(10000);
		
		WebElement op2 = driver.findElement(By.className("inverted"));
		
		String des2 = op2.getText();
		
		System.out.println("Text in about Us Web Element using Class name  : " + des2);
		
		WebElement op3 = driver.findElement(By.cssSelector(".inverted"));
		
		String des3 = op3.getText();
		
		System.out.println("Text in about Us Web Element using CssSelector  : " + des3);
		
		WebElement op4 = driver.findElement(By.linkText("About Us"));
		
		String des4 = op4.getText();
		
		System.out.println("Text in about Us Web Element using linkTest  : " + des4);
		
		
		driver.close();
		
		// ui inverted huge green button
		
		
	}

}
