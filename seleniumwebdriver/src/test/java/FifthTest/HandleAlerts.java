package FifthTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Normal alert with OK button  => Alerts are not webelements so we can't inspect them
		
//		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//		Thread.sleep(3000);
		
//		driver.switchTo().alert().accept(); //click ok button on the alert
		
//		Alert myalert = driver.switchTo().alert(); //Alert is separate return type
//		System.out.println("The Alert text is: " + myalert.getText()); //getting the text of the alert
//		myalert.accept();
		
		//Confirmation Alert => it has Ok and Cancel button
		
//		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().accept(); //Close alert using the Ok button
//		driver.switchTo().alert().dismiss(); //Close alert using the cancel button
		
		//Prompt Alert = > It has input text box, Ok and Cancel button
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(3000);
		
		Alert mypromptalert = driver.switchTo().alert();
		mypromptalert.sendKeys("Welcome to the programming world");  //entering text in the alert text box 
		mypromptalert.accept();
		
		
	}

}
