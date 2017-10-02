package elementNotClickable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClickYorXcoordinates {
	
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void EleClickY(){
		
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https%3A%2F%2Fwww.yahoo.com");
		
		WebElement elementToClick = driver.findElement(By.xpath("//label[text()='Stay signed in']"));
		
		// Scroll the browser to the element's Y position
		 
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");
		 
		elementToClick.click();
}
	
	@Test
	public void EleClickX(){
		
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https%3A%2F%2Fwww.yahoo.com");
		
		WebElement elementToClick = driver.findElement(By.xpath("//label[text()='Stay signed in']"));
		
		// Scroll the browser to the element's Y position
		 
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().x+")");
		 
		elementToClick.click();
	}
}
