package SliderTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//Handling Slider
		
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header']"));
		
		System.out.println("Default location of the min slider:" +min_slider.getLocation()); //(68, 297) => (x,y)
		
		act.dragAndDropBy(min_slider, 50, 297).perform();  //Dragging slider to other side
		
		System.out.println("Location of the min slider after moving:" +min_slider.getLocation());
		
		//Max Slider
		
		WebElement max_slider = driver.findElement(By.xpath("span[2]"));
		
		System.out.println("Default location of the max slider:" +max_slider.getLocation());
		
		act.dragAndDropBy(min_slider, -50, 297).perform();
		
		System.out.println("Location od the max slider after moving" +max_slider.getLocation());
		
	}

}
