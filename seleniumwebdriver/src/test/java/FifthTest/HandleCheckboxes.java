package FifthTest;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Select specific checkbox
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//Select all checkboxes => every checkbox is a webelement
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
		
//		for(int i = 0; i < checkboxes.size(); i++) {  //normal for loop
//			
//			checkboxes.get(i).click();
//		}
		
//		for(WebElement checkbox:checkboxes) {   //With the help of enhanced for loop we cannot select specific for loop (it doesn't have indexing)
//			
//			checkbox.click();
//		}
//		
		//Select last 3 checkboxes
		
//		for(int i = 5; i < checkboxes.size(); i++ ) {
//			
//			checkboxes.get(i).click();
//			
//		}
		
		//Select first 3 checkboxes
		
		for(int i = 0; i < 3; i++) {
			
			checkboxes.get(i).click();
		}
		
		Thread.sleep(3000);
		
		//Unselect checkboxes if they are selected

		for (int i = 0; i < checkboxes.size(); i++) {
			
			if(checkboxes.get(i).isSelected()) {
				
				checkboxes.get(i).click();
			}
			
		}
		
		
		
	}

}
