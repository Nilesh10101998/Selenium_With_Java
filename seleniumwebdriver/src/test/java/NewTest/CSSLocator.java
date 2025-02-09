package NewTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();  //maximize the browser window
		
		//CSS-Selector (tagname is optional in this locator)
		//tagname - id
//		driver.findElement(By.cssSelector("input[id=small-searchterms]")).sendKeys("T-Shirts");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		
		//tagname - classname
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirts");
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		
		//tagname - attribute
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Pants");

		
	}

}
