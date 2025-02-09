package FourthTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demo.nopcommerce.com/"); //get method accepts URL only in String format
		
//		driver.navigate().to("https://demo.nopcommerce.com/"); //navigate method accepts URL in String as well in URL object format
//		driver.manage().window().maximize();
		
//		URL myurl = new URL("https://demo.nopcommerce.com/"); //navigate method accepts URL in URL object form
//		driver.navigate().to(myurl);  //we never use URL in object format(sometimes we used it)
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();  //navigating back side
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward(); //navigating to the forward side
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();  //to refresh the page
		
		
	}
	
}
