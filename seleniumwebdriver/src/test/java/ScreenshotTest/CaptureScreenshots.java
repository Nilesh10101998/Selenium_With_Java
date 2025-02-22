package ScreenshotTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Capture full page screenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver; //Need to do down casting because TakesScreenshot is another interface 
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir") + "\\Screenshots\\newpage.png");
		sourcefile.renameTo(targetfile); //Copy sourcefile to the targetfile
		
//		FileUtils.copyFile(sourcefile, targetfile);  //This is another approach to copy the file

		
		//Capture the screenshot from the specific section of the page
		
//		WebElement featuredProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		File sourcefile = featuredProducts.getScreenshotAs(OutputType.FILE);
//		File targetfile = new File(System.getProperty("user.dir") + "\\Screenshots\\featureProducts.png");
//		sourcefile.renameTo(targetfile);
		
		
		//Capture the screenshot of the webelement
//		WebElement logopic = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		File sourcefile = logopic.getScreenshotAs(OutputType.FILE);
//		File targetfile = new File(System.getProperty("user.dir") + "\\Screenshots\\logopicture.png");
//		sourcefile.renameTo(targetfile);
		
		driver.quit();
		
	}

}
