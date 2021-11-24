package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		String url = "https://training-support.net/selenium/dynamic-attributes";
		driver.get(url);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[@type='submit' and @onclick = 'signIn()']")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Welcome Back, admin"));
		
		WebElement msg = driver.findElement(By.id("action-confirmation"));
		
		System.out.println(msg.getText());
		
		driver.close();
	}

}
