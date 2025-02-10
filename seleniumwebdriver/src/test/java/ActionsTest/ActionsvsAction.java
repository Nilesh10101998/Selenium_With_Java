package ActionsTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsvsAction {
	
	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		
		//Action is the interface and use to store the created actions
		Action myaction = act.contextClick(button).build(); //creating an action and storing into a variable
		
		myaction.perform();  //Performing complete action
		
	}

}
