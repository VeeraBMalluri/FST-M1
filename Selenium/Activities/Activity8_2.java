package in.ibm.com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 
{
	public static void main(String[] args) 
	{
		WebDriver  driver = new FirefoxDriver();
		String url = "https://training-support.net/selenium/tables";
		driver.get(url);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = \"sortableTable\"]/tbody/tr"));
		System.out.println("The total no of Rows - " + rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id = \"sortableTable\"]/tbody/tr[1]/td"));
		System.out.println("The total number of columns - " + columns.size());
		
		WebElement R2C2 = driver.findElement(By.xpath("//table[@id = \"sortableTable\"]/tbody/tr[2]/td[2]"));
		System.out.println("Second Row Second column cell value is " + R2C2.getText());
		
		driver.findElement(By.xpath("//table[@id = \"sortableTable\"]/thead/tr/th[1]")).click();
		
		WebElement R2C22 = driver.findElement(By.xpath("//table[@id = \"sortableTable\"]/tbody/tr[2]/td[2]"));
		System.out.println("Second Row Second column cell value is " + R2C22.getText());
		
		List <WebElement> footer = driver.findElements(By.xpath("//table[@id = \"sortableTable\"]/tfoot/tr/th"));
		for (WebElement Foot : footer)
		{
			System.out.println(Foot.getText());
		}
		
		driver.close();
		
	}
}
