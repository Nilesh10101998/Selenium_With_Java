package JavaScriptExecutorDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorTest {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		//Using JavascriptExecutor Interface to perform sendKeys action
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  //Here we need to do casting to assign driver object due to the WebDriver interface 
//		JavascriptExecutor js = driver;  //We can directly assign ChromeDriver class object to JavascriptExecutor interface variable
		
		//Passing the text into input text box => alternative of the sendKeys() method
		
		js.executeScript("arguments[0].setAttribute('value', 'John')", inputbox); //set value attribute as John text => This is the alternative of the sendKeys method
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='male']"));
		
		//Using JavascriptExecutor Interface to perform click action
		js.executeScript("arguments[0].click()", radiobutton); //alternative approach to click on the element
		
	}

}
