package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;
	
	//Constructor => this will initiate the driver
	
	LoginPage2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); //This is mandatory in PageFactory approach
	}
	
	//Locators => all locators
	
	//By using PageFactory approach
	
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement text_password;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement login_button;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	
	//Action Methods => by using the PageFactory approach
	
	public void setUserName(String user) 
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd) 
	{
		txt_username.sendKeys(pwd);
	}
	
	public void clickLogin() 
	{
		login_button.click();
	}
	
	
	
	
}
