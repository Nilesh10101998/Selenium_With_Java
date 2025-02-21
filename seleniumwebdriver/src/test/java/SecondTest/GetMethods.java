package SecondTest;

import java.util.Set;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		//get method:- opens the URL on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//getTitle method:- returns the title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl Method:- returns the current url of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource method returns the source code of the page
//		System.out.println(driver.getPageSource());
		
		//getWindowHandle method: it returns the ID of single browser window
//		String windowID = driver.getWindowHandle();
//		System.out.println("Window ID: " +windowID);
		
		//getWindowHandles method: it returns the ID's of multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
//		driver.close(); 
		
	}

}
