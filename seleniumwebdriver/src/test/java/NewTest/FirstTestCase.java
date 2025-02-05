package NewTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {
	
	public static void main(String[] args) {
		
		//launch the browser (chrome)
//		ChromeDriver driver = new ChromeDriver();
		
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		
		//Open the URL
		driver.get("https://demo.opencart.com/");
		
		//Validate the title of the page
		 String pageTitle = driver.getTitle();	//get the title of the page	
		 
		 if(pageTitle.equals("Your Store")) {  //Comparing actual and expected title
			 
			 System.out.println("Test Passed!");
		 }
		 
		 else {
			 System.out.println("Test Failed!");
		 }
		
		 //close the browser
		 driver.quit();  
//		 driver.close();
		 
	}

}
