package dataDriven;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepositoryWP.WordPressObjects;

public class DataProviderWordID_Pass {
	
	WebDriver driver;
	WordPressObjects WPO;
	
	@BeforeMethod
	public void open(){
		driver = new FirefoxDriver();
		driver.get("https://wordpress.com/wp-login.php?");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
    @Test(dataProvider="wordpress")
     public void login(String usr, String pas) throws InterruptedException{
    	
    	WPO = new WordPressObjects(driver);
    	WPO.credentials(usr,pas);
    	WPO.login();
    	Thread.sleep(2000);
    	WPO.validate();
    	}
    
     
    @AfterMethod
    public void tearDown(){
    	driver.quit();
    }
    
    @DataProvider(name="wordpress")
    public Object[][] passData(){
    	Object[][] obj= new Object[3][2];
    	obj[0][0]="djfnjd";
    	obj[0][1]="skdfjksjdf";
    	obj[1][0]="rupa.debnath1987@gmail.com";
    	obj[1][1]="rupa_infosys";
    	obj[2][0]="kjnkj";
    	obj[2][1]="pkkjk";
    	return obj;
    	
    	
    }
}
