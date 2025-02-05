package NewTest;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import org.openqa.selenium.*;

public class LocatorsTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name locator
		 
//		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id locator
		
//		boolean logoDisplaystatus = driver.findElement(By.id("logo")).isDisplayed();
//		System.out.println(logoDisplaystatus);
		
		//linktext and partiallinktext locators
		
//		driver.findElement(By.linkText("Tablets")).click(); //linktext is always have 'a' tagname and href attribute and we need to pass complete text of the link
		
//		driver.findElement(By.partialLinkText("Tab")).click(); //We don't need to pass the all text of the link (Partial text only)
		
		//classname locator
		
//		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));   //Findelements method returns multiple webelements
//		System.out.println("total number of header links: " +headerLinks.size());
		
		//tagname locator (tagname and classname locators are using to get the group of elements) 
		
		List<WebElement> links = driver.findElements(By.tagName("a"));  //finding all links by using tagname
		System.out.println("total number of links: " +links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));  //finding all images by using the tagname
		System.out.println("total number of images: " +images.size());
		
		
	}
}
