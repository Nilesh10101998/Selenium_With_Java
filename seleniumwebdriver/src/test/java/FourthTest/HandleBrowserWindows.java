package FourthTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {
	
	public static void main(String[] args) {
		
         WebDriver driver = new ChromeDriver();
		
		//Implicit wait Declaration
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));  //this is applicable for every line of code in the test script
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> windowIDS = driver.getWindowHandles(); //We cannot extract individual element in Set collection because it doesn't have a get method
		
		//Approach 1
//		List<String> windowList = new ArrayList(windowIDS);  //Converted Set collection into the List collection (we convert to List collection because it has a get method and we can extract individual element)
//		
//		String parentID = windowList.get(0);
//		String childID = windowList.get(1);
//		
//		driver.switchTo().window(childID);  //Used switchTo method to switch the child window
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(parentID);  //Used switchTo method to switch the parent window
//		System.out.println(driver.getTitle());
		
		//Approach 2 => use this approach when there are more than three different windows
		
		for (String winID: windowIDS) {
			
			String title = driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM")) {
				
				System.out.println(driver.getCurrentUrl());
				
			}
	
		}
		
	}

}
