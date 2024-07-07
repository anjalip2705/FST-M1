package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	WebDriver driver;
  @Test (groups = {"HeaderTests", "ButtonTests"})
  public void pagetitletest() {
	  String title = driver.getTitle();
	  System.out.println("Title is:" + title);
	  Assert.assertEquals(title, "Target Practice");
  }
  
  @Test (dependsOnMethods = {"pagetitletest"}, groups = {"HeaderTests"})
  public void headertest1 () {
	  
	  String h3 = driver.findElement(By.id("third-header")).getText();
	  Assert.assertEquals("Third header", h3);
	  
	  String color = driver.findElement(By.className("ui green header")).getCssValue("h5");
	  Assert.assertEquals("green", color);
  }

  @Test (dependsOnMethods = {"pagetitletest"}, groups = {"ButtonTests"})
  public void buttontest1() {
	  
	  String olive = driver.findElement(By.className("ui olive button")).getText();
	  Assert.assertEquals("Olive", olive);
  }
  @Test (dependsOnMethods = {"pagetitletest"}, groups = {"ButtonTests"})
  public void buttontest2() {
	  String brown = driver.findElement(By.className("ui brown button")).getCssValue("h5");
	  Assert.assertEquals("green", brown);
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
