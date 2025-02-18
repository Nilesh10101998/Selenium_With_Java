package TestAnnotations2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	@Test
//	void test_hardassertions() 
//	{
//		System.out.println("testing....");
//		System.out.println("testing...");
//		
//		Assert.assertEquals(1, 1); //hard assertions
//		
//		System.out.println("testing....");
//		System.out.println("testing...");
//		
//		System.out.println("testing....");
//		System.out.println("testing...");
//		
//		Assert.assertEquals(1, 2);  //hard assertions
//		
//		System.out.println("testing....");
//		System.out.println("testing...");
//	}
	
	void soft_assertions() 
	{
//		System.out.println("testing....");
//		System.out.println("testing...");
//		
//		SoftAssert soft = new SoftAssert(); //We need to create the object of this class to access the methods
//		
//		soft.assertEquals(1, 2);  //soft assertions
//		
//		System.out.println("testing....");
//		System.out.println("testing...");
		
//		soft.assertAll(); //this is mandatory method for this assertions
		
		
		System.out.println("testing....");
		System.out.println("testing...");
		
		SoftAssert soft = new SoftAssert(); //We need to create the object of this class to access the methods
		
		soft.assertEquals(1, 1);  //soft assertions
		
		System.out.println("testing....");
		System.out.println("testing...");
		
		soft.assertAll(); //this is mandatory method for this assertions
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
