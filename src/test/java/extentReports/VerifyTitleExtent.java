package extentReports;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import utility.WebPageScreenshot;

public class VerifyTitleExtent {
	WebDriver driver= new FirefoxDriver();
	ExtentReports report;
	ExtentTest logger;
	WebPageScreenshot screenst = new WebPageScreenshot();
	
@Test
public void verify(){
	report = new ExtentReports("C:\\ReportsExtent\\ReportsExtent.html");
	logger=report.startTest("Test to verify web page title");
	
	//driver= new FirefoxDriver();
	logger.log(LogStatus.INFO, "Browser started");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://google.com/");
	
	String Title =driver.getTitle();
	int TitleLn=driver.getTitle().length();
	System.out.println("Title " + Title);
	System.out.println("Length of title " + TitleLn);
	logger.log(LogStatus.INFO, "Verifying title");
	
	Assert.assertTrue(Title.contains("Googlej"), "Title is not matching");
	logger.log(LogStatus.PASS, "Title is correct");
}

@AfterMethod
public void tearDown(ITestResult result){

	if(result.getStatus()==ITestResult.FAILURE){
	
	screenst.captureScreenshot(driver, result.getName());
	String image=logger.addScreenCapture("C:/Apps/Fruit/Screensht/"+result.getName()+".png");
	logger.log(LogStatus.FAIL,image);
		}
	report.endTest(logger);
	report.flush();
	driver.quit();
	
}

}
