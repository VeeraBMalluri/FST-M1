package in.ibm.com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.training-support.net/selenium/target-practice";
		driver.get(url);
		System.out.println(driver.getTitle());
		
		WebElement th1 = driver.findElement(By.xpath("//h3[@id=\"third-header\"]"));
		
		System.out.println(th1.getText());
		
		WebElement fh1 = driver.findElement(By.xpath("//div[@class=\"column\"]/h5"));
		
		// another way -> xpath("//h5")
		
		System.out.println(fh1.getCssValue("color"));

		WebElement vb1 = driver.findElement(By.xpath("//div[@class=\"spaced\"][1]/button[3]"));
		
		// another way is -> By.xpath("//button[contains(text(),"Violet")]"
		
		System.out.println(vb1.getAttribute("class"));
		
		WebElement gb1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		
		System.out.println(gb1.getText());
		
		driver.close();
	}
	

}
