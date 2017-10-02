package webdriverListener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		EventFiringWebDriver event1=new EventFiringWebDriver(driver);
		ActivityCapture handle = new ActivityCapture();
		
		event1.register(handle);
		
		event1.get("http://google.com/");
		event1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String Title =driver.getTitle();
		int TitleLn=driver.getTitle().length();
		
		System.out.println("Title " + Title);
		System.out.println("Length of title " + TitleLn);
		
		event1.unregister(handle);

	}

}
