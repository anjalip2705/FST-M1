package activities;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity1 {
	WebDriver driver;

	@Test
	public void f() {
		
		String title1 = driver.getTitle();
		Assert.assertEquals("Training Support",title1);
		driver.findElement(By.id("about-link")).click();
		String title2 = driver.getTitle();
		Assert.assertEquals("About Training Support",title2);
	}
	@BeforeClass
	public void beforeClass() {
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("https://v1.training-support.net/");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
