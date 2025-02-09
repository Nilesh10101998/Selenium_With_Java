package FourthTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {
	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
			
		//Implicit wait Declaration
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));  //this is applicable for every line of code in the test script
			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
			
		Set<String> windowIDS = driver.getWindowHandles(); //We cannot extract individual element in Set collection because it doesn't have a get method
			
		//Closing the specific browser window
		
		for(String winID : windowIDS) {
			
			String title = driver.switchTo().window(winID).getTitle();	
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM") || title.equals("OrangeHRM")) {
				System.out.println(winID);
				driver.close();
				
			}
			
		}
		
	}

}
