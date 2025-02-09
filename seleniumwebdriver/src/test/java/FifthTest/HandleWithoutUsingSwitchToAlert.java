package FifthTest;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWithoutUsingSwitchToAlert {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));  //Declaration of explicit wait
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Handling alerts without using the switch to method
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(3000);
		
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent()); //capture alert
		
		System.out.println("The Alert text is: " + myalert.getText()); //getting the text of the alert
		myalert.accept();
		
	}
}
