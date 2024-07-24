package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000L));
		
		driver.get("https://v1.training-support.net/selenium/input-events");
		System.out.println("Title of the page is:"+driver.getTitle());
		
		driver.findElement(By.id("D3Cube")).click();
		List<WebElement> cubeValue = driver.findElements(By.xpath("//div[@id='D3Cube']/div"));
		for(WebElement element: cubeValue) {
			if(element.getAttribute("class") == "active") {
				System.out.println("Value of cube in front is:"+ element.getText());
			}
		}
		driver.close();
	}

}
