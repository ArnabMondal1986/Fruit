//elementNotClickable Exception can occur in both firefox and chrome

package elementNotClickable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementNotClick {
	
	@Test
	public void Ele(){
		
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https%3A%2F%2Fwww.yahoo.com");
		
		//driver.findElement(By.xpath("//label[text()='Stay signed in']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//label[text()='Stay signed in']"))).build().perform();
		action.click();
	}
}
