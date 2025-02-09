package FrameTest;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Handling iframe
		//frame 1
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']")); //stored iframe in the variable
		driver.switchTo().frame(frame1); //switched to the iframe
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent(); //go back to the page
		
		//frame2
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2); //switched to another frame
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent(); //go back to the page
		
		//frame3
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
		
		//inner iframe - part of frame3
		driver.switchTo().frame(0);  //Switching to frame using the index (it is having only one inner frame)
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		
		driver.switchTo().defaultContent(); //go back to the page
		
		
	}

}
