package in.ibm.com.testNgTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @Test
    @Parameters({"username", "password"})
    public void loginTestCase(String username, String password) {
   
        WebElement Username = driver.findElement(By.id("username"));
        WebElement Password = driver.findElement(By.id("password"));
       
        Username.sendKeys(username);
        Password.sendKeys(password);
        
    
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }

}
