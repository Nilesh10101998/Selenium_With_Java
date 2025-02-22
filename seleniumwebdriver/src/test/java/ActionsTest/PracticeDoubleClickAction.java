package ActionsTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeDoubleClickAction {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
		box1.clear(); //Clear the text from the first box
		box1.sendKeys("Hi Nilesh!"); //type new text to the box
		
		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();
		
		
		
	}

}
