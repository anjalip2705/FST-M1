package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
	WebDriver driver;
  @Test
  @Parameters({"username","password"})
  public void login(String username, String password) {
	 
	 WebElement login = driver.findElement(By.id("username"));
	 WebElement pwd = driver.findElement(By.id("password"));
	 
	 login.sendKeys(username);
	 pwd.sendKeys(password);
	 
	 driver.findElement(By.xpath("//button[@class='ui button']")).click();
	 
	 String msg = driver.findElement(By.id("action-confirmation")).getText();
	 Assert.assertEquals(msg, "Welcome Back, admin");
	 
	 
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 
		 driver.get("https://v1.training-support.net/selenium/login-form");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
