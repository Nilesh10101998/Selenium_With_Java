package DropDownTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//Bootstrap dropdown contains options with checkboxes and also we can select multiple options in it (It is also known as Multi-Select dropdown)
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();  //open dropdown options
		
		//Select single option from the dropdown
//		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all options and then findout size
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options: " +options.size());
		
		//Printing options from the dropdown
		
//		for(WebElement opt : options) {  //Used enhanced for loop to print all the dropdown options
//		
//			System.out.println(opt.getText());
//		}
		
		//Select multiple options => 
		
		for(WebElement opt : options) {
		
			String option = opt.getText();
			
			if(option.equals("Java") || option.equals("Python") || option.equals("MySQL")) {
				
				opt.click();  //We select options on the basis of the text
			}
		}
		
	}

}
