package ssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLChrome {
	public static void main(String[] args) {
		 
		// Create object of DesiredCapabilities class
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		 
		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 
		// This will open  chrome browser using above created profile
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);
		 
		driver.get("https://www.cacert.org/");
		 
		 
		}
}
