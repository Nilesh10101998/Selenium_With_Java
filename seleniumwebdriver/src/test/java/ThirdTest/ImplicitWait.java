package ThirdTest;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait Declaration
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //this is applicable for every line of code in the test script
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}
}
