package in.ibm.com.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.training-support.net/selenium/popups";
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver,10);
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		WebElement button = driver.findElement(By.xpath("//button[contains(@class, \"inverted\")]"));
		
		action.moveToElement(button).pause(Duration.ofSeconds(5)).build().perform();
		String tooltiptext = button.getAttribute("data-tooltip");
		System.out.println("Tool Tip text is : " +tooltiptext);
		button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//div[@class='ui form']/button")).click();
		
		String confmsg = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Confirmation message : "+ confmsg);
		
		driver.close();
		
	}

}
