package profile;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.firefox.FirefoxProfile;
 
import org.openqa.selenium.firefox.internal.ProfilesIni;
 
public class  SetDefaultProfile{

      public static void main(String[] args) {
      
    	// Create object of ProfilesIni class
 
        ProfilesIni init=new ProfilesIni();
        // Get the default session  
 
        FirefoxProfile profile=init.getProfile("default");
        // Pass the session/profile to FirefoxDriver 
 
        WebDriver driver=new FirefoxDriver(profile);
          }
}