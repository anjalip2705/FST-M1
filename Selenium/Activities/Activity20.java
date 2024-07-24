package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("prompt")).click();
		
		Alert prompt = driver.switchTo().alert();
		String text = prompt.getText();
		System.out.println(text);
		
		prompt.sendKeys("Awesome!");
		Thread.sleep(5000);
		prompt.accept();
		
		driver.close();		
	}

}
