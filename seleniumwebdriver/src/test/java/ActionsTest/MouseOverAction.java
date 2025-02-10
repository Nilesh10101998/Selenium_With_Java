package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement pointme = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		WebElement mobiles = driver.findElement(By.xpath("//div[@class='dropdown-content']//a[contains(text(),'Mobiles')]"));
		
		Actions act = new Actions(driver); //Declared action class 
		
		//Actions class methods should end with the build and perform method
		
		//Mouse Over action => build method is to create an action and perform method is complete an action
		
//		act.moveToElement(pointme).moveToElement(mobiles).click().build().perform(); //mouse hover action means move to element action
		act.moveToElement(pointme).moveToElement(mobiles).perform(); //perform method will create and complete the action
		
		
		
	}

}
