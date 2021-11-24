package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.training-support.net/selenium/iframes";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("The title of the page is : " +driver.getTitle());
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
		
		System.out.println(driver.findElement(By.id("actionButton")).getText());
		System.out.println(driver.findElement(By.id("actionButton")).getCssValue("background-color"));
		driver.findElement(By.id("actionButton")).click();
		System.out.println(driver.findElement(By.id("actionButton")).getText());
		System.out.println(driver.findElement(By.id("actionButton")).getCssValue("background-color"));
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
		
		System.out.println(driver.findElement(By.id("actionButton")).getText());
		System.out.println(driver.findElement(By.id("actionButton")).getCssValue("background-color"));
		driver.findElement(By.id("actionButton")).click();
		System.out.println(driver.findElement(By.id("actionButton")).getText());
		System.out.println(driver.findElement(By.id("actionButton")).getCssValue("background-color"));
		
		driver.close();
	}

}
