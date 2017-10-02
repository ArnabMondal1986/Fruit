package mouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover {
	
	@Test
	public void hov(){
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("qp")).sendKeys("Software Testing");
		
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.cssSelector("div.Sbtn[tabindex='-1']"));
		
		act.moveToElement(ele).build().perform();
		
		act.click().build().perform();		
	}

}
