package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Download the Gecko driver
		WebDriverManager.firefoxdriver().setup();

		// Initialize the driver
		WebDriver driver = new FirefoxDriver();

		// Open the URL
		driver.get("https://v1.training-support.net/");

		System.out.println("Title of the first page is: " + driver.getTitle());

		driver.findElement(By.id("about-link")).click();
		
		System.out.println("Title of the second page is: " + driver.getTitle());
		
//		driver.findElement(By.xpath("//@h[text="/* Coming Soon */"]"));
		// Close the browser
		driver.quit();
	}

}
