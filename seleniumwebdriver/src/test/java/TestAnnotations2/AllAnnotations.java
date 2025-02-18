package TestAnnotations2;

import org.testng.annotations.*;

public class AllAnnotations {

	@BeforeSuite
	void BeforeSuite() {
		System.out.println("This is the before suite....");

	}

	@AfterSuite
	void AfterSuite() {
		System.out.println("This is the after suite....");

	}

	@BeforeTest
	void BeforeTest() {
		System.out.println("This is the BeforeTest...");

	}

	@AfterTest
	void AfterTest() {
		System.out.println("This is AfterTest...");

	}

	@BeforeClass
	void BeforeClass() {
		System.out.println("This is Before Class...");

	}

	@AfterClass
	void Afterclass() {
		System.out.println("This is AfterClass...");

	}

	@BeforeMethod
	void BeforeMethod() {
		System.out.println("This is the Before method...");

	}

	@AfterMethod
	void AfterMethod() {
		System.out.println("This is After method...");

	}

	@Test(priority=1)
	void TestMethod1() {
		System.out.println("This is Test method1...");

	}

	@Test(priority=2)
	void TestMethod2() {
		System.out.println("This is Test method2...");

	}

}
