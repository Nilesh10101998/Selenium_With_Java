package SliderTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//available from Selenium 4 versions
//		driver.switchTo().newWindow(WindowType.TAB); //this will open in new browser tab
		
		driver.switchTo().newWindow(WindowType.WINDOW); //This will open the new window
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	
		
		}
	
}
