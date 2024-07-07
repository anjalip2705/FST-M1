package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity9 {
	WebDriver driver;
  @Test
  public void simpleAlertTestCase() {
	  driver.findElement(By.id("simple")).click();
	  Alert simplealert = driver.switchTo().alert();
	  Reporter.log("Switched to simple alert");
	  String alertText = simplealert.getText();
	  simplealert.accept();
	  Assert.assertEquals(alertText, "This is a JavaScript Alert!");
	  
  }
  @Test
  public void confirmAlertTestCase() {
	  driver.findElement(By.id("confirm")).click();
	  Alert s = driver.switchTo().alert();
	  Reporter.log("Switched to confirm alert");
	  String c = s.getText();
	  Assert.assertEquals(c, "This is a JavaScript Confirmation!");
	  s.accept();
	  

	  
  }
  @Test
  public void promptAlertTestCase() {
	  driver.findElement(By.id("prompt")).click();
	  Alert p = driver.switchTo().alert();
	  Reporter.log("Switched to prompt alert");
	  driver.switchTo().alert().sendKeys("testing");
	  String cs = p.getText();
	  Assert.assertEquals(cs, "This is a JavaScript Prompt!");
	  p.sendKeys("prompt");
	  p.accept();
	  
  }
  @BeforeClass
  public void beforeMethod() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  
	  driver.get("https://v1.training-support.net/selenium/javascript-alerts");
	  driver.switchTo().defaultContent();
  }

  @AfterClass
  public void afterMethod() {
	  driver.quit();
  }

}
