package reporter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {
	WebDriver driver= new FirefoxDriver();
	
	@Test
	  public void testRepo(){
		    
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Reporter.log("Broser opened");
			driver.get("http://google.com/");
			
			String Title =driver.getTitle();
			int TitleLn=driver.getTitle().length();
			
			Reporter.log("Web Page information");
			System.out.println("Title " + Title);
			System.out.println("Length of title " + TitleLn);
}
}
