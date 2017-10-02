package ssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLInternetExplorer {
	public static void main(String[] args) {
		 
		// Create object of DesiredCapabilities class
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		 
		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 
		// This will open  chrome browser using above created profile
		
		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(cap);
		
		driver.get("https://www.cacert.org/");
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		 
		}
}
