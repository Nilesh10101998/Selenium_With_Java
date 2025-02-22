package FifthTest;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAlerts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//		driver.switchTo().alert().accept(); // Click on the okay button

//		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();

		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("I clicked in the alert");
		alert.accept();
//		alert.dismiss();

	}

}
