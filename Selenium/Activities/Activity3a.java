package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity3a {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts();
		
		driver.get("https://v1.training-support.net/selenium/login-form");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
		String welcomeText = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("Welcome text: "+welcomeText);
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File savedScreenshot = new File("src/test/resources/screenshot.jpg");
		FileUtils.copyFile(screenshot, savedScreenshot);
				
		driver.quit();
		
	}

}

