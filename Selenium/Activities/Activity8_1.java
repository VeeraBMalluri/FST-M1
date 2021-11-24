package in.ibm.com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 
{

	public static void main(String[] args) 
	{
		WebDriver  driver = new FirefoxDriver();
		String url = "https://training-support.net/selenium/tables";
		driver.get(url);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class= \"ui celled striped table\"]/tbody/tr"));
		System.out.println("Total no of rows - " + rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class= \"ui celled striped table\"]/tbody/tr[1]/td"));
		System.out.println("Total no of columns - " + columns.size());
		
		WebElement row3 = driver.findElement(By.xpath("//table[@class= \"ui celled striped table\"]/tbody/tr[3]"));
		System.out.println(row3.getText());
		
		WebElement R2C2 = driver.findElement(By.xpath("//table[@class= \"ui celled striped table\"]/tbody/tr[2]/td[2]"));
		System.out.println(R2C2.getText());
		
		driver.close();
		
	}

}
