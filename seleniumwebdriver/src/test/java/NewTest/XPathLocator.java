package NewTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPathLocator {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with Single attribute
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-Shirts");
		
		//Xpath with multiple attributes
//		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Pants");
		
		//Xpath with the and operator
//		driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("Shirts");
		
		//Xpath with the or operator (it means one xpath should be correct in two xpaths)
//		driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']")).sendKeys("Jackets");
		
		//Xpath with contain texts
		boolean displaystatus = driver.findElement(By.xpath("//h3[contains(text(),'Featured')]")).isDisplayed();  //verifying the display status
		System.out.println(displaystatus);
		
		String texts = driver.findElement(By.xpath("//h3[contains(text(),'Featured')]")).getText(); //getting the text
		System.out.println(texts);
		
		
		
		
	}

}
