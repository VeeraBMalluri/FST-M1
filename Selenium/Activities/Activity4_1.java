package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.training-support.net";
		driver.get(url);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@id = \"about-link\"]")).click();
		
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}

}
