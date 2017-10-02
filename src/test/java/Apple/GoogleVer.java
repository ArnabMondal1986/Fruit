package Apple;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GoogleVer{
	
	  public static void main(String[] arg) throws Exception{
		   
		    DesiredCapabilities caps = DesiredCapabilities.safari();
		    
			WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://google.com/");
			
			String Title =driver.getTitle();
			int TitleLn=driver.getTitle().length();
			
			System.out.println("Title " + Title);
			System.out.println("Length of title " + TitleLn);
			
			String CurrentUrl=driver.getCurrentUrl();
			int LnUrl=driver.getCurrentUrl().length();
			
			System.out.println("Current Url " + CurrentUrl);
			System.out.println("Length of current Url " + LnUrl);
			
			driver.navigate().refresh();
					
			driver.quit();
		}
	   
	   
}
