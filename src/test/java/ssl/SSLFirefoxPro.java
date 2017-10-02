package ssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
	 
	public class SSLFirefoxPro {
	 
	public static void main(String[] args) {
	 
	//It create firefox profile
	FirefoxProfile profile=new FirefoxProfile();
	
	// This will set the true value
	profile.setAcceptUntrustedCertificates(true);
	 
	// This will open  firefox browser using above created profile
	WebDriver driver=new FirefoxDriver();
	 
	driver.get("https://www.cacert.org/");
	 }
}
