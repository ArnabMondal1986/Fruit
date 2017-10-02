package screenshotS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.WebPageScreenshot;

public class Screenshot {
	
	WebDriver driver;
	WebPageScreenshot st =new WebPageScreenshot();
	
	@BeforeMethod
	public void startup(){
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void screenst() throws Exception{
	
	driver.findElement(By.id("lst-ibl")).sendKeys("automation");
	//driver.findElement(By.id("gs_htif0")).sendKeys("automation");
	System.out.println("Screenshot taken");
	driver.quit();
	
	}
	
	@Test
	public void appr(){
		driver.findElement(By.id("lst-ib")).sendKeys("automation");
		driver.findElement(By.className("lsbl")).click();
		driver.quit();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus()){
			st.captureScreenshot(driver,result.getName());
		}
		driver.quit();
		
	}
}
