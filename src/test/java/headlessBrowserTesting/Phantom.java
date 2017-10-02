//Can capture screenshot unlike HtmlUnitDriver

package headlessBrowserTesting;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Phantom {
	
	@Test
	public void Phan(){
		
		File scr = new File("C:\\Phantom\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", scr.getAbsolutePath());
		//System.setProperty("phantomjs.binary.path", "C:\\Phantom\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
}
