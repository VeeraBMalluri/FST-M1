package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		String url = "https://training-support.net/selenium/dynamic-attributes";
		driver.get(url);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("user1");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password1");
		
		driver.findElement(By.xpath("//div[@class = 'field'][3]/input")).sendKeys("password1");
		driver.findElement(By.xpath("//div[@class = 'field'][4]/input")).sendKeys("sample@gamil.com");
		
		driver.findElement(By.xpath("//button[@onclick = \"signUp()\"]")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Thank you for registering, user1"));
		
		WebElement msg = driver.findElement(By.id("action-confirmation"));
		
		System.out.println(msg.getText());
		
		driver.close();
		
	}

}
