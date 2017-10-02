package windowsHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwitchWindows {
	
	WebDriver driver;
	
	@Test
	public void swithWin(){
	
	driver=new FirefoxDriver();
	driver.get("http://www.naukri.com/");
	
	String parentHandle=driver.getWindowHandle();
	System.out.println("First window "+parentHandle);
	
	driver.findElement(By.className("mTxt")).click();
	
	Set<String> handles=driver.getWindowHandles();
	System.out.println("All windows are" +handles);
	int sizeOfwindows=handles.size();
	System.out.println("Total number of windows "+sizeOfwindows);
	
	for(String windowHandle:handles){
		if(windowHandle!=parentHandle){
			driver.switchTo().window(windowHandle);
			driver.close();
			
		}		
	}
	driver.switchTo().window(parentHandle);
	
	/*public class PopupRnD {
        @Test
      public void test5() throws Exception {
      WebDriver driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://site2.way2sms.com/content/prehome.jsp");

      String mainwindow=driver.getWindowHandle();
      driver.findElement(By.linkText("Contact us")).click();

  for(String winHandle :driver.getWindowHandles()){
   driver.switchTo().window(winHandle);
   if(driver.getTitle().equals("Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks")){
System.out.println("You are in required window");
                    break;
                    } else{
      System.out.println("Title of the page after - switchingTo: " + driver.getTitle());
                }
            }
       driver.switchTo().window(mainwindow);
       driver.quit();
    }
      }*/
	}
}
