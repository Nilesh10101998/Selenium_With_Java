package ScreenshotTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotPractice {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Capture a full page screenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver; //Downcasting
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File(System.getProperty("user.dir") + "//Screenshots//Practice.png");
//		sourcefile.renameTo(destinationfile);
		
		FileUtils.copyFile(sourcefile, destinationfile);
		
		
		
	}

}
