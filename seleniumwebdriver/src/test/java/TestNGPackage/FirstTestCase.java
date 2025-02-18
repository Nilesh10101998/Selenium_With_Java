package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	// open app => Login => Logout
	
	@Test(priority=1)
	void OpenApp() 
	{
		System.out.println("Opening application...");
		
	}
	
	@Test(priority= 2)
	void Login() 
	{
		System.out.println("Login to application....");
		
	}
	
	@Test(priority= 3)
	void LogOut()
	{
		System.out.println("Logout from application...");
		
	}
	

}
