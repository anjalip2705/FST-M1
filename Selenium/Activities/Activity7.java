package activities;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		
		System.out.println(driver.getTitle());
		
		WebElement football = driver.findElement(By.id("draggable"));
		
		WebElement dropzone1 = driver.findElement(By.id("droppable"));
		
		WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
		
		builder.dragAndDrop(football, dropzone2).build().perform();
		
		String x = dropzone1.getText();
		
		if(x == "Dropped!") {
			System.out.println("Football is dropped in first zone");
		}
		
		builder.clickAndHold().moveToElement(dropzone2).pause(5000).release().build();
		
		String y = dropzone2.getText();
		
		if(x == "Dropped!") {
			System.out.println("Football is dropped in second zone");
		}
		
		driver.close();
		
	}

}
