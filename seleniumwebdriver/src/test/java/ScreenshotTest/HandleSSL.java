package ScreenshotTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); //ChromeOptions class help us to customize the browser
		options.setAcceptInsecureCerts(true);  //accept SSL certificates => by default this set as false
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println("Title of the page: " +driver.getTitle());
		
	}

}
