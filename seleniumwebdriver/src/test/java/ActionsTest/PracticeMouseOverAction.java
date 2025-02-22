package ActionsTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeMouseOverAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement pointme = driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));
		WebElement mobiles = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));

		Actions action = new Actions(driver);
		action.moveToElement(pointme).perform();
		action.click(mobiles).perform();
//		System.out.println(mobiles.getText());
		
//		driver.quit();

	}

}
