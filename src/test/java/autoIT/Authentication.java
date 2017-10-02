package autoIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Authentication {
	WebDriver driver;
	
    @Test
    public void val() throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.engprod-charter.net/");
	
	Thread.sleep(4000);
	Runtime.getRuntime().exec("C:\\Users\\Chutki\\Desktop\\Autoit\\Authentication.exe");
	
     }
}
