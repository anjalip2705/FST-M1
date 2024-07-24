package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts();
		
		driver.get("https://v1.training-support.net/selenium/target-practice");
		
		System.out.println("Title of the page is: "+driver.getTitle());
		
		System.out.println("Third header text: "+driver.findElement(By.xpath("//div[@class='column']/h3")).getText());
		
		System.out.println("Fifth header text: "+driver.findElement(By.xpath("//div[@class='column']/h5")).getCssValue("color"));
		
		System.out.println("Violet button classes: "+driver.findElement(By.xpath("//button[@class='ui violet button']")).getAttribute("class"));
		
		System.out.println("Grey button text: "+driver.findElement(By.xpath("//button[@class='ui grey button']")).getText());
		 	
		driver.quit();		
		
	}

}
