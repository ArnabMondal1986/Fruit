package profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SetNewProfile {
	
	public static void main(String[] args){
		
	ProfilesIni profile = new ProfilesIni();
	FirefoxProfile ffprofile = profile.getProfile("SELENIUM"); //Give the name of new profile.
	WebDriver driver = new FirefoxDriver(ffprofile);
	driver.get("http://learn-automation.com/");
    driver.quit();
	}
}
