package in.ibm.com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://training-support.net/selenium/selects";
		driver.get(url);
		
		WebElement opt = driver.findElement(By.id("multi-select"));
		
		Select dropdown = new Select(opt);
		
		if (dropdown.isMultiple())
		{
			dropdown.selectByVisibleText("Javascript");
			dropdown.selectByValue("node");
			dropdown.selectByIndex(1);
			dropdown.selectByIndex(5);
			dropdown.selectByIndex(6);
			dropdown.deselectByValue("node");
			dropdown.deselectByIndex(6);
										
		}
		System.out.println("First selected Option is : " +  dropdown.getFirstSelectedOption().getText());
		
		List<WebElement> options = dropdown.getAllSelectedOptions();
		for (WebElement opt1 : options)
		{
			System.out.println(opt1.getText());
		}
		
		dropdown.deselectAll();
		
		driver.close();

	}

}
