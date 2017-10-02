package testNGlisteners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.WebPageScreenshot;

public class TestNGListener implements ITestListener {
	
	WebPageScreenshot st =new WebPageScreenshot();
	WebDriver driver=new FirefoxDriver();

	public void onTestStart(ITestResult result) {
		System.out.println("Test "+result.getName()+ " started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test "+result.getName()+ " successful");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test "+result.getName()+ "  failed");
		if(ITestResult.FAILURE==result.getStatus()){
			st.captureScreenshot(driver,result.getName());
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test "+result.getName()+ " skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {	
	}
}
