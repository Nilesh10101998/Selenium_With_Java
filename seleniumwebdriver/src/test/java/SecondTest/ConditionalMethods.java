package SecondTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed method: to check the display status of the webelement
		
//		boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();  //findelement method returns the webelement
//		System.out.println("The display status of the logo: " + logo);
		
		//isEnabled method: to check the enable and disable mode of the webelement
		
//		boolean status = driver.findElement(By.xpath("//input[@name='FirstName']")).isEnabled();
//		System.out.println("Enable status: " +status);
		
		//isSelected: 
		boolean status = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println("Selected status: " +status);
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		boolean status2 = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println("Selected status: " +status2);
		
		boolean status3 = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("Selected status of checkbox: " +status3);
		
	}

}
