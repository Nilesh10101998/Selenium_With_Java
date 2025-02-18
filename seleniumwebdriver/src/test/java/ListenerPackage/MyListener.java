package ListenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onStart(ITestContext context) {  //this method will execute only once before starting the method execution

	   System.out.println("Test execution is started....");

	}

	public void onTestStart(ITestResult result) {  //this method will execute multiple times before every test method

		System.out.println("Test started...");

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test passed...");

	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Test failed...");

	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Test skipped...");

	}

	public void onFinish(ITestContext context) {

		System.out.println("Test finished...");

	}

}
