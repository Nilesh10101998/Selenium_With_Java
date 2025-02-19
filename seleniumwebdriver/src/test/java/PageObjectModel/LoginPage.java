package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//Constructor => this will initiate the driver
	
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators => all locators
	
	By text_username = By.xpath("//input[@name='username']");
	By text_password = By.xpath("//input[@name='password']");
	By login_button = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	
	
	//Action Methods => Perform actions
	
	public void setUserName(String user)
	{
		driver.findElement(text_username).sendKeys(user);
	}
	
	public void setPassword(String pwd) 
	{
		driver.findElement(text_password).sendKeys(pwd);
	}
	
	public void clickLogin() 
	{
		driver.findElement(login_button).click();
	}
	
	
}
