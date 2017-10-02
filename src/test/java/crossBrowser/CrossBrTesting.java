package crossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrTesting {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void chooseBrowser(String browser){
	
	if(browser.equalsIgnoreCase("firefox")){
	driver = new FirefoxDriver();
	}
	
	else if(browser.equalsIgnoreCase("chrome")){
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	else if(browser.equalsIgnoreCase("ie")){
		
	System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	}
	
	driver.get("http://google.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String Title =driver.getTitle();
	int TitleLn=driver.getTitle().length();
	
	System.out.println("Title " + Title);
	System.out.println("Length of title " + TitleLn);
	driver.quit();
	}
}
