package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsTest2 {

	@BeforeClass
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
	
	@AfterClass
	void Logout() 
	{
		System.out.println("This is the logout...");
		
	}
	
}
