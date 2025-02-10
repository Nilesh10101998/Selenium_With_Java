package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions act = new Actions(driver);  //Declared the action class
		
		//Right click action
		act.contextClick(button).perform(); //to right click on the webelement
		
		//Click on copy
		driver.findElement(By.xpath("//li//span[contains(text(),'Copy')]")).click();
		
		//Close alert box
		driver.switchTo().alert().accept();
		
	}
}
