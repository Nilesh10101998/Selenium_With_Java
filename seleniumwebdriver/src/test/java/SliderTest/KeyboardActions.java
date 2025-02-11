package SliderTest;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	
	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://text-compare.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to the Programming world");
	    
	    //handling Keyboard actions
	    Actions act = new Actions(driver);
	    
	    //Ctrl+A => Selects the text
	    act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	    
	    //ctrl+C => Copy the text into clipboard
	    act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	    
	    //Tab => Shift to the second box
	    act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	    
	    //ctrl+v => Paste the text
	    act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	    
	    //ctrl+shift+A
//	    act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
	    
	    //Press Enter button
//	    act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	    
	}

}
