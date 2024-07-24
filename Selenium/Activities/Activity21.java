package activities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/tab-opener");
		System.out.println(driver.getTitle());
		System.out.println("Current tab:" + driver.getWindowHandles());
		
		driver.findElement(By.id("launcher")).click();
		Thread.sleep(2000);
		for(String handle: driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
		driver.findElement(By.className("spacer")).click();
		System.out.println(driver.getTitle());
		System.out.println("Current tab:" + driver.getWindowHandles());
		
		driver.quit();
	}

}
