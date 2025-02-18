package ListenerPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListenerPackage.MyListener.class) //We need to declare this before triggering the Listener class for the specific class

public class NewTest {

	WebDriver driver;

	@BeforeClass
	void setup() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true); // assertEquals method can take all types of data type
	}

	@Test(priority = 2)
	void testAppUrl() {
		Assert.assertEquals(driver.getCurrentUrl(),	"https://opensource-demo.orangehrmlive.com");

	}
	
	
	@Test(priority = 3, dependsOnMethods = {"testAppUrl"})
	void testHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}
	

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
