package testNGlisteners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNGlisteners.TestNGListener.class)
public class Testlisten {
	
	WebDriver driver= new FirefoxDriver();
	
	@BeforeMethod
	public void start(){
	driver.get("http://google.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void verifyTitle(){
	
	String Title =driver.getTitle();
	int TitleLn=driver.getTitle().length();
	
	System.out.println("Title " + Title);
	System.out.println("Length of title " + TitleLn);
	Assert.assertTrue(false);
	}
	
	@Test
	public void verifyUrl(){
		
	String CurrentUrl=driver.getCurrentUrl();
	int LnUrl=driver.getCurrentUrl().length();
	
	System.out.println("Current Url " + CurrentUrl);
	System.out.println("Length of current Url " + LnUrl);
	Assert.assertTrue(true);
	}
}
