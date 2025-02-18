package TestAnnotations2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTest1 {

	@Test
	void testTitle() {
		
		String expected_title = "nopCommerce demo store. Home page title";
		String actual_title = "nopCommerce demo store. Home page title";

		//This conditional statement give the passed status if method if failed
//		if (expected_title.equals(actual_title)) 
//		{
//			System.out.println("Test Passed..!");
//		} 
//		else 
//		{
//			System.out.println("Test Failed..!");
//		}

		//Assertions => asserting using Assert class and it's methods
		
//		Assert.assertEquals(expected_title, actual_title);
		
		//Another approach of assertions 
		
		if (expected_title.equals(actual_title)) 
		{
			System.out.println("Test Passed..!");
			Assert.assertTrue(true);
		} 
		else 
		{
			System.out.println("Test Failed..!");
			Assert.assertTrue(false);
		}
	}

}
