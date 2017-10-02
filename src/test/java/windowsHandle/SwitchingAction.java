package windowsHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
	
public class SwitchingAction {
	 
	WebDriver driver=new FirefoxDriver();
	
	@Test
	  public void test() throws InterruptedException 
	  {
	  driver.get("http://www.naukri.com/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.className("mTxt")).click();
	  
	  // Get and store both window handles in array
	  Set<String> AllWindowHandles = driver.getWindowHandles();
	  String window1 = (String) AllWindowHandles.toArray()[0];
	  String window2 = (String) AllWindowHandles.toArray()[1];
	  
	  //Switch to window2(child window)
	  driver.switchTo().window(window2);
	  driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
	  //performing actions on it
	  Thread.sleep(5000);
	  
	  //Switch to window1(parent window)
	  driver.switchTo().window(window1);
	  driver.findElement(By.xpath("//option[@id='country6']")).click();
	  //performing actions on it
	  
	  //Once Again switch to window2(child window)
	  driver.switchTo().window(window2);
	  //performing actions on it
	  driver.close();
  
	  //Once Again switch to window1(parent window)
	  driver.switchTo().window(window1);
	  //performing actions on it
	  
	  }
}
