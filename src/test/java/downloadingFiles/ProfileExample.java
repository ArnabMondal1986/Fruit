/*This program first handles untrusted ssl certificate and 
then downloads a file without asking we want to save file or not in a new profile.This basically demostrates 
actual usage of profile where we set our preferences*/

package downloadingFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ProfileExample {
	
	public static void main(String[] args){
		
		//Assigning new profile NewPro and set preference according to needs
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile ffprofile = profile.getProfile("NewPro"); //Give the name of new profile.
		
		// This will set the true value when untrusted certificate error shows
		ffprofile.setAcceptUntrustedCertificates(true);

		// Set preferences for file type for downloading without asking
		ffprofile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		
		WebDriver driver = new FirefoxDriver(ffprofile);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.filehippo.com/download_adobe_reader");

		driver.findElement(By.xpath("//div[@id='program-header']/div[2]/a/span")).click();
		    
	}
}
