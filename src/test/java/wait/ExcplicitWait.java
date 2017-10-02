package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExcplicitWait {
	
	@Test
	public void waitExpl(){
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
	
	WebElement myDynamicElement1 = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.id("Passwd")));
	
	WebElement myDynamicElement2 = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("huk")));
	
	myDynamicElement1.click();
	
	myDynamicElement2.click();
	}

}
