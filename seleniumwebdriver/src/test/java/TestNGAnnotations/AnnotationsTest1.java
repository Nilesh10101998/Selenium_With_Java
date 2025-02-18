package TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest1 {
	
	@BeforeMethod
	void Login()
	{
		System.out.println("This is the login...");
		
	}
	
	@Test(priority=1)
	void Search()
	{
		System.out.println("This is the search...");
		
	}
	
	@Test(priority=2)
	void AdvancedSearch()
	{
		System.out.println("This is the advanced search..");
		
	}
	
	@AfterMethod
	void Logout() 
	{
		System.out.println("This is the logout...");
		
	}
	
	
}
