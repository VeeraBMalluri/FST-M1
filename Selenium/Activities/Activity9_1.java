package in.ibm.com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 
{

	public static void main(String[] args) 
	{
		WebDriver  driver = new FirefoxDriver();
		String url = "https://training-support.net/selenium/selects";
		driver.get(url);
		
		WebElement choosen = driver.findElement(By.id("single-value"));
		

		WebElement opt = driver.findElement(By.xpath("//select[@id='single-select']"));
		
		Select select = new Select(opt);
		
		select.selectByVisibleText("Option 2");
		System.out.println(choosen.getText());
		
		select.selectByIndex(3);
		System.out.println(choosen.getText());
		
		select.selectByValue("4");
		System.out.println(choosen.getText());
		
		List<WebElement> alloptions = select.getOptions();
		
		System.out.println(" Total no of options are : " + alloptions.size());
		System.out.println("All option details are listed below : ");
		
		for (WebElement option : alloptions )
		{
			System.out.println(option.getText());
		}
		
		
		driver.close();
		
	}

}

