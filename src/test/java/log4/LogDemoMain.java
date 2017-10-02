package log4;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogDemoMain {
	
	public static void main(String[] args){
	
    Logger logger=Logger.getLogger("LogDemo"); //Mention classname for which you want logs. Add log4j jar to your project.
	
	PropertyConfigurator.configure("Log4j.properties");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://google.com/");
	logger.info("Opening browser");
	
	String Title =driver.getTitle();
	logger.info("Getting title");
	
	System.out.println("Title " + Title);
	logger.info("Displaying title");
	
	int TitleLn=driver.getTitle().length();
	logger.info("Getting title length");
		
    System.out.println("Length of title " + TitleLn);
    logger.info("Displaying length of title");
    
    driver.quit();
	}
	}
