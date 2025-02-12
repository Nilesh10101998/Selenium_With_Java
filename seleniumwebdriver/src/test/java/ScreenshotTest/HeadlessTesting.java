package ScreenshotTest;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();  //need to declare this to run test in the headless mode
		options.addArguments("--headless=new");  //Setting for headless mode of execution
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		
		String title = driver.getTitle();
		
		if(title.equals("nopCommerce demo store. Home page title")) 
		{
		  System.out.println("Test Passed..!");	
		}
		else
		{
		 System.out.println("Test Failed..!");	
		}
		
		driver.quit();
		
	}

}
