package ScreenshotTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedMessageOnScreen {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions(); //ChromeOptions class help us to customize the browser
//		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"}); //remove chrome is being controlled by automated software
		options.addArguments("--incognito"); //open test in the incognito mode
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		
	}
	
}
