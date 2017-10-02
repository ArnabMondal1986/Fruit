package ssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class SSLFirefox {
 
public static void main(String[] args) {
 
	// Create object of DesiredCapabilities class
	DesiredCapabilities cap=DesiredCapabilities.firefox();
 
	// Set ACCEPT_SSL_CERTS  variable to true
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
 
	// This will open  firefox browser using above created profile
	WebDriver driver=new FirefoxDriver(cap);
 
	driver.get("https://www.cacert.org/");
 }
}