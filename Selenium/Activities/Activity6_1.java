package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		String url = "https://training-support.net/selenium/dynamic-controls";
		
		driver.get(url);
		System.out.println("Page Titile is " + driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
		WebElement togglecb = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		togglecb.click();
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		System.out.println("checkbox is not visible");
		
		togglecb.click();
		
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		
		System.out.println("check box is visible now");
		
		driver.close();
		
	}

}
