package ActionsTest;
	
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoubleClickAction {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
		box1.clear(); //Clear the text from the first box
		box1.sendKeys("Hi Nilesh!"); //type new text to the box
		
		//Double click action on the button
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();  //double click action by using the doubleClick method
		
		//validation => box2 should contains "Hi Nilesh" text
		String text = box2.getDomAttribute("value");
		System.out.println("Captured vale is: " +text);  //printing the copied text
		
		if(text.equals("Hello World!"))
		{
			System.out.println("Text copied..!");
		}
		else 
		{
			System.out.println("Text not copied properly...");
		}	
		
	}

}
