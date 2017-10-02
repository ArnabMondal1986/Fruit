package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class AlertHandle {
	
	public WebDriver driver;
	
	@Test
	public void alert(){
		
		//code for assigning default profile
		ProfilesIni init=new ProfilesIni();
        FirefoxProfile profile=init.getProfile("default");
        WebDriver driver=new FirefoxDriver(profile);
        
		driver.get("http://google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("name")).click(); //element which shows alert after clicking
		driver.switchTo().alert();
		
		String text=driver.switchTo().alert().getText();
		
		System.out.println("Text inside alert box "+ text);
		
		driver.switchTo().alert().accept();
		
	}

}
