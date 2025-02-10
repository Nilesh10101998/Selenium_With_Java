package ActionsTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	
	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		//Handling Drag and Drop action
		Actions act = new Actions(driver);
		
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']")); //source element
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']")); //taget element
		
		act.dragAndDrop(rome, italy).perform();  //dragging and drop element
		
		WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement unitedtstates = driver.findElement(By.xpath("//div[@id='box103']"));
		
		act.dragAndDrop(washington, unitedtstates).perform();
		
	}

}
