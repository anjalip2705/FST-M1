package activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity3 {
	
	AndroidDriver driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		// Desired Capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.calculator");
		options.setAppActivity("com.android.calculator2.Calculator");

		// Server Address
		URL serverURL = new URL("http://localhost:4723/");
		// Driver Initialization
		driver = new AndroidDriver(serverURL, options);
	}
	
	@Test
	public void plus() {
		driver.findElement(AppiumBy.accessibilityId("5")).click();
		driver.findElement(AppiumBy.accessibilityId("plus")).click();
		driver.findElement(AppiumBy.accessibilityId("9")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result = driver.findElement(AppiumBy.id("result_final")).getText();
		System.out.println("Output of plus operation is: "+result);
		Assert.assertEquals(result, "14");
		driver.findElement(AppiumBy.accessibilityId("clear")).click();
	}
	
	@Test
	public void minus() {
		driver.findElement(AppiumBy.accessibilityId("10")).click();
		driver.findElement(AppiumBy.accessibilityId("minus")).click();
		driver.findElement(AppiumBy.accessibilityId("5")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result1 = driver.findElement(AppiumBy.id("result_final")).getText();
		System.out.println("Output of minus operation is: "+result1);
		Assert.assertEquals(result1, "5");
		driver.findElement(AppiumBy.accessibilityId("clear")).click();
	}
	
	@Test
	public void multiply() {
		driver.findElement(AppiumBy.accessibilityId("5")).click();
		driver.findElement(AppiumBy.accessibilityId("multiply")).click();
		driver.findElement(AppiumBy.accessibilityId("100")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result2 = driver.findElement(AppiumBy.id("result_final")).getText();
		System.out.println("Output of multiply operation is: "+result2);
		Assert.assertEquals(result2, "500");
		driver.findElement(AppiumBy.accessibilityId("clear")).click();
	}
	
	@Test
	public void divide() {
		driver.findElement(AppiumBy.accessibilityId("50")).click();
		driver.findElement(AppiumBy.accessibilityId("divide")).click();
		driver.findElement(AppiumBy.accessibilityId("2")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result3 = driver.findElement(AppiumBy.id("result_final")).getText();
		System.out.println("Output of divide operation is: "+result3);
		Assert.assertEquals(result3, "25");
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
