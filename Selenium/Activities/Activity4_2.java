package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebElement;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.training-support.net/selenium/simple-form";
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id =\"firstName\"]")).sendKeys("IBM");
		driver.findElement(By.xpath("//input[@id =\"lastName\"]")).sendKeys("Consulting");
		driver.findElement(By.xpath("//input[@id =\"email\"]")).sendKeys("veer401@in.ibm.com");
		driver.findElement(By.xpath("//input[@id =\"number\"]")).sendKeys("9900990099");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(10000);
		driver.close();
		
	}

}
