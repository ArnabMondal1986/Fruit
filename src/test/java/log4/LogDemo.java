package log4;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LogDemo {
	
    Logger logger=Logger.getLogger("LogDemo"); //Mention classname for which you want logs. Add log4j jar to your project.
	
    WebDriver driver = new FirefoxDriver();
	
	@Test
	public void logtest1(){
	
	//Logger logger=Logger.getLogger("LogDemo"); //Mention classname for which you want logs. Add log4j jar to your project.
	
	PropertyConfigurator.configure("Log4j.properties");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://google.com/");
	logger.info("Opening browser");
	
	String Title =driver.getTitle();
	logger.info("Getting title");
	
	System.out.println("Title " + Title);
	logger.info("Displaying title");
	}
	
	/*@Test
	public void logtest2(){
		
		int TitleLn=driver.getTitle().length();
		logger.info("Getting title length");
		
		System.out.println("Length of title " + TitleLn);
		logger.info("Displaying length of title");
	}*/
	}
