package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.training-support.net/selenium/input-events";
		driver.get(url);
		
		System.out.println("The Title of the page is " + driver.getTitle());
		
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(cube);
		
		builder.click().perform();
		Thread.sleep(10000);
		WebElement val = driver.findElement(By.className("active"));
		System.out.println(" Left Click Value : "+val.getText());
		
		builder.doubleClick().perform();
		Thread.sleep(10000);
		val = driver.findElement(By.className("active"));
		System.out.println("Double Click Value : "+ val.getText());
		
		builder.contextClick().perform();
		Thread.sleep(10000);
		val = driver.findElement(By.className("active"));
		System.out.println("Right Click Value : "+val.getText());
		
		driver.close();
		
		}

}
