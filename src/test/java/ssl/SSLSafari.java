package ssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class SSLSafari {
	
	public static void main(String[] args) {
	
	// Create object of DesiredCapabilities class
	 
	DesiredCapabilities cap=DesiredCapabilities.safari();
	 
	// Set ACCEPT_SSL_CERTS  variable to true
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	 
	// Set the driver path
	System.setProperty("webdriver.safari.driver","Safari driver path"); //set path of safari driver
	 
	// Open browser with capability
	WebDriver driver=new SafariDriver(cap);
	
	driver.get("https://www.cacert.org/");	
	}

}
