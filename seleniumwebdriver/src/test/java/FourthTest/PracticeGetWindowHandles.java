package FourthTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeGetWindowHandles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();

		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);

		for (String winID : windowids) {

			String title = driver.switchTo().window(winID).getTitle();
			System.out.println(title);

			if (title.equals("OrangeHRM")) {
				System.out.println(winID);
				driver.close();

			}
		}

	}

}
