package screenshotS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ScreenshotRobot;

public class ScreenRobot {
	WebDriver driver;
	ScreenshotRobot sr =new ScreenshotRobot();
	
	@BeforeMethod
	public void startup(){
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void screenst() throws Exception{
	
	driver.findElement(By.id("lst-ib")).sendKeys("automation");
	driver.quit();
	
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws Exception{
		
		if(ITestResult.FAILURE==result.getStatus()){
			sr.captureScreenshot(driver,"RobotErrorscreen");
		}
		driver.quit();
		
	}
}
