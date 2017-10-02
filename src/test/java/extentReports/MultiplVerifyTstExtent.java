package extentReports;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.WebPageScreenshot;

public class MultiplVerifyTstExtent{

	WebDriver driver= new FirefoxDriver();
	ExtentReports report;
	ExtentTest logger;
	WebPageScreenshot screenst = new WebPageScreenshot();
	
	@BeforeTest
	public void startRpt(){
		
	report = new ExtentReports("C:\\ReportsExtent\\ReportsExtent.html"); //true replace existing report with new report
	
	/*extent.addSystemInfo("HostName", "RupaNew").
	addSystemInfo("Environment", "QA").
	addSystemInfo("User Name", "Rupa Debnath"); //passing system information
	
	extent.loadConfig(new File(("user.dir")+"/extent-config.xml")); //manually create extent-config.xml in project folder and copy config.xml from Configuration topic in http://extentreports.relevantcodes.com/java/*/ 
	}
	
	@BeforeMethod
	 public void openBrow(){
		 driver.get("http://google.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	
	@Test
	public void verifyTitle(){
		
		logger=report.startTest("verifyTitle");
		
		logger.log(LogStatus.INFO,"Getting title details");
		
		String Title =driver.getTitle();
		int TitleLn=driver.getTitle().length();
		
		System.out.println("Title of page" + Title);
		System.out.println("Length of title " + TitleLn);
		
		logger.log(LogStatus.INFO, "Verifying title");
		Assert.assertTrue(Title.contains("Google"), "Title is not matching"); //test by failing this
		logger.log(LogStatus.PASS, "Title matches");
}
	
	@Test
	public void verifyURL(){
		
		logger=report.startTest("verifyURL");
		
		logger.log(LogStatus.INFO,"Getting url details");
		
		String CurrentUrl=driver.getCurrentUrl();
		int LnUrl=driver.getCurrentUrl().length();
		
		System.out.println("Current Url is" + CurrentUrl);
		System.out.println("Length of current Url " + LnUrl);
		
		logger.log(LogStatus.INFO, "Verifying url of google page");
		Assert.assertTrue(CurrentUrl.contains("googleo"), "Url is wrong"); //test by failing this
		logger.log(LogStatus.PASS, "URL matches");
	}
	
	@Test
	public void VerifySearch(){
		
		logger=report.startTest("VerifySearch");
		
		logger.log(LogStatus.INFO,"Search in google search box");
		
		driver.findElement(By.id("lst-ib")).sendKeys("load");
		WebElement ele =driver.findElement(By.name("btnKo")); //test by failing this
		
		logger.log(LogStatus.INFO,"Verifying search Button");
		
		if (ele.isDisplayed()){
		ele.click();
		}
		logger.log(LogStatus.PASS, "Search button present");
	}
	
	@AfterMethod
	public void generateResult(ITestResult result) throws Exception{

    if(result.getStatus()==ITestResult.FAILURE){
	
    screenst.captureScreenshot(driver, result.getName());
	String image=logger.addScreenCapture("C:/Apps/Fruit/Screenshot/"+result.getName()+".png");
	
	logger.log(LogStatus.FAIL,image);
	}
	else if(result.getStatus()==ITestResult.SKIP){
	
	logger.log(LogStatus.SKIP, "Test is skipped");
	}
    report.endTest(logger);
    }
	
	@AfterTest
	public void tearDown(){
		
		report.flush();
		report.close();
		driver.quit();
	}
}
