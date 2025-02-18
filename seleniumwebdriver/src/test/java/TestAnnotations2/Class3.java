package TestAnnotations2;

import org.testng.annotations.Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

class Class3 {

	@Test
	void pqr() {
		System.out.println("this is pqr from class3...");

	}

	@BeforeSuite
	void BeforeSuite() {
		System.out.println("this is the before suite method...");

	}

	@AfterSuite
	void AfterSuite() {
		System.out.println("this is the after suite method...");

	}

}
