package windowsHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class TestNaukri {
 
@Test
public void TestPopUp() throws InterruptedException{

WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();
driver.get("http://www.naukri.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

String parent=driver.getWindowHandle();
driver.findElement(By.className("mTxt")).click();
Set<String>s1=driver.getWindowHandles();
 
// Now we will iterate using Iterator
Iterator<String> I1= s1.iterator();
 
while(I1.hasNext())
{
  String child_window=I1.next();
 
// Here we will compare if parent window is not equal to child window then we will close
if(!parent.equals(child_window))
{
driver.switchTo().window(child_window);
System.out.println(driver.switchTo().window(child_window).getTitle());
driver.close();
}
 }
driver.switchTo().window(parent);
	}
}