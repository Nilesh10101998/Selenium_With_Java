package JavaScriptExecutorDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll down page by pixel number
		
//		js.executeScript("window.scrollBy(0, 1800)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));  //return pixel of the scrolled page
		
		//Scroll the page till the element is visible
		WebElement element = driver.findElement(By.xpath("//strong[contains(text(),'Community poll')]"));
		
		js.executeScript("arguments[0].scrollIntoView();", element);  //scrolling to the page till the element is visible
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll to the end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", args);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		//scrollin to the initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", args);
		
	}

}
