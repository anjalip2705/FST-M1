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

public class Activity3b {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts();
		
		driver.get("https://v1.training-support.net/");
		
		System.out.println("Title of the first page is: " + driver.getTitle());

		driver.findElement(By.xpath("//div[@class=\"ui text container\"]/a")).click();
		
		System.out.println("Title of the second page is: " + driver.getTitle());
		
		File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File savedScreenshot1 = new File("src/test/resources/screenshot.jpg");
		FileUtils.copyFile(screenshot1, savedScreenshot1);
		
		driver.quit();
	}

}
