package SliderTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement regLink = driver.findElement(By.xpath("//a[@class='ico-register']"));
		
		Actions act = new Actions(driver);
		
		//Opening link in the new tab
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform(); //control+Registration link
		
		//Switching to registration page
		List<String> ids = new ArrayList(driver.getWindowHandles());
		
		//Registration'
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//input[@id='Firstname']")).sendKeys("John Kenedy");
		
		//Home Page
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-Shirts");
		
	}
	

}
