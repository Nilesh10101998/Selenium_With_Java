package TestNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderTest {

	WebDriver driver;  //Declared globally to use in the class
	
	@BeforeClass
	void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider="dp") //this dataprovider is the attribute (that's why start in lowercase letter)
	void testLogin(String username, String password) throws InterruptedException 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(2000);	
		
	}
	
	@AfterClass
	void tearDown() 
	{
		driver.close();
		
	}
	
	
	@DataProvider(name="dp", indices = {0,2})  //This dataprovider is the annotation (that's why start in uppercase letter)
	Object[][] loginData() 
	{
		Object data[][] = {
				             {"Admin", "admin123"},
				             {"Nilesh", "nil@123"},
				             {"Sneha",   "Sneha@123"}
				
		                  };
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
