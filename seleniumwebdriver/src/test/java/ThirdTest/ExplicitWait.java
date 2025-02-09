package ThirdTest;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Explicit Wait Declaration
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));  
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//Explicit Wait
		
		WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        username.sendKeys("Admin");
         
        WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        password.sendKeys("admin123");
        
        WebElement loginbutton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")));
        loginbutton.click();
        
	}
}
