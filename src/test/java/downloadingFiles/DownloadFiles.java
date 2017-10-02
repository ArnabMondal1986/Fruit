package downloadingFiles;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
 
 
public class DownloadFiles {
 
public static void main(String[] args) {
 
FirefoxProfile profile=new FirefoxProfile();
 
// Set preferences for file type 
profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
  
// Open browser with profile                   
WebDriver driver=new FirefoxDriver(profile);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.filehippo.com/download_adobe_reader");

driver.findElement(By.xpath("//div[@id='program-header']/div[2]/a/span")).click();
    
 }
 
}