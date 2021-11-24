package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Activity10_3 
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://training-support.net/selenium/drag-drop";
		driver.get(url);
	
		
		WebElement ball = driver.findElement(By.xpath("//img"));
		Actions action = new Actions(driver);
		
		WebElement dropzone1 = driver.findElement(By.id("droppable"));
		action.dragAndDrop(ball, dropzone1).build().perform();
		
		
		String val1 = dropzone1.getText();
		
		System.out.println(val1);
		
		WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
		
		action.dragAndDrop(ball, dropzone2).build().perform();
		
		
		
		String val2 = dropzone2.getText();
		
		System.out.println(val2);
		driver.close();
		
	}
}
