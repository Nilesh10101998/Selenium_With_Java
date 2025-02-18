package TestAnnotations2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	void abc() 
	{
		System.out.println("This is the abc from class1..");
		
	}
	
	@BeforeTest
	void bt() 
	{
		System.out.println("This is the BeforeTest method...");
		
	}
	
	
	
	
	
}
