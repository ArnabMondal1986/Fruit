package utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testbase {
	
	public static WebDriver driver=null;
	static ConfigReader conf;
		
	public static void setUp() throws IOException{
		
		conf = new ConfigReader();
				
		if(conf.getbrowser().contains("chrome")|| conf.getbrowser().equalsIgnoreCase("chrome"))
			{System.setProperty("webdriver.chrome.driver",conf.getChromeDriverPath());
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--test-type");
	        //options.addArguments("--disable-extensions");
			driver= new ChromeDriver(options);
			}
			
		else if(conf.getbrowser().contains("explorer") || conf.getbrowser().equalsIgnoreCase("explorer"))
			{System.setProperty("webdriver.ie.driver",conf.getIEDriverPath());
			driver=new InternetExplorerDriver();
			}
			
		else if(conf.getbrowser().contains("firefox") || conf.getbrowser().equalsIgnoreCase("firefox"))
		{driver=new FirefoxDriver();
		}
			

		driver.get(conf.getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	public static void closewin(){
		driver.close();
		driver.quit();
	}
	

}
