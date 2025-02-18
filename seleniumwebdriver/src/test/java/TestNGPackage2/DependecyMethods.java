package TestNGPackage2;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependecyMethods {
	
	//Dependency methods of the TestNG
	
	@Test(priority=1)
	void openApp() 
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods = {"openApp"})  //This method depends on the openApp method if that pass then will execute
	void login() 
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods = {"login"})
	void search() 
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=4, dependsOnMethods = {"login", "search"}) //we can specify 2 different methods as well
	void advsearch() 
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=5, dependsOnMethods = {"login"})
	void logout() 
	{
		Assert.assertTrue(true);
	}
	
	
	
	
	
	
	
	
	

}
