package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
  WebDriver driver;
  
  @Test
  public void f() {
	  Assert.assertEquals("Target Practice", driver.getTitle());
  }
  
  @Test
  public void f1() {
	  driver.findElement(By.xpath("//button[@class='ui black button']")).click();
	  Assert.assertEquals("Target", driver.getTitle());
	  
  }
  @Test(enabled = false)
  public void f2()  {
	  System.out.println("Method not implemented");
  }
  @Test
  public void f3() {
	  throw new SkipException("Skipping test case");
  }
  
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.get("https://v1.training-support.net/selenium/target-practice");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
