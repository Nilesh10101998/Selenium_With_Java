package TestNGPackage2;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test(priority=1, groups = {"regression", "sanity", "functional"})
	void paymentInRupees() 
	{
		System.out.println("This is payment in rupees...");
	}
	
	
	@Test(priority=2, groups = {"regression", "sanity", "functional"})
	void paymentInDollars() 
	{
		System.out.println("This is payment in dollars...");
	}

}
