package FifthTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {
	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 //Handling authenticated pop-up
		 
		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); //we modify url and pass username and password to it
		 driver.manage().window().maximize();
		 
	}

}
