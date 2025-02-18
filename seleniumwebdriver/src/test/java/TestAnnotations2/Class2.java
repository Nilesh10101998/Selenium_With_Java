package TestAnnotations2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	void xyz() 
	{
       System.out.println("This is the xyz from class2..");
		
	}
	
	@AfterTest
	void at() 
	{
		System.out.println("This is AfterTest method...");
		
	}
	

}
