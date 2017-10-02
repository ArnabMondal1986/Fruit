package windowsHandle;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSwitchWindow {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {

		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	    driver.get("http://www.naukri.com/");
	    String handle= driver.getWindowHandle();
	    System.out.println("Present windows "+handle);
        //driver.findElement(By.xpath("//button[@onclick='newMsgWin()']")).click();
	    
	    Thread.sleep(4000);

	    Set<String> handles = driver.getWindowHandles();

	    System.out.println("All windows "+handles);
	    System.out.println("All windows size "+handles.size());

		for (String handle1 : handles) {
			if(handle1!=handle){
		    driver.switchTo().window(handle1);
		    driver.close();
			}
		}
		driver.switchTo().window(handle);}
}