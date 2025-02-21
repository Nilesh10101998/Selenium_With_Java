package DropDownTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //This wait applies globally to all elements in the script
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcountryele = driver.findElement(By.xpath("//select[@id='country']"));  //stored dropdown in the variable
		Select drpcountry = new Select(drpcountryele); //Declare select class and pass dropdown variable as a parameter
		
		//select options from the dropdown
		
//		drpcountry.selectByVisibleText("France");  //selecting option by using the text
//		drpcountry.selectByValue("japan");  //selecting option by using the value (value is the attribute)
//		drpcountry.selectByIndex(2);   //selecting option by using the index (index will start from 0)
		
		//capture options from the dropdown
		 
	    List<WebElement> options = drpcountry.getOptions(); //it will return the list of options of the dropdowns
	    System.out.println("Number of options in the dropdown: " +options.size());
//	    System.out.println(options);
	    
	    //Printing the options of the Dropdown
	    
//	    for(int i = 0; i < options.size(); i++) {  
//	    	
//	    	System.out.println(options.get(i).getText());
//	    	
//	    }
	   
	    //Printing the options of the dropdown by using the enhanced for loop
	    
	    for (WebElement opt : options) {
	    	
	    	System.out.println(opt.getText());
	    }
		
	}

}
