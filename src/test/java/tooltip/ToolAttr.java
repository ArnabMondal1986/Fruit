package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolAttr {
	
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void tool(){
		
		driver.get("https://en.wordpress.com/wp-login.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_login")).sendKeys("rupa.debnath1987@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("rupa_infosys");
		driver.findElement(By.id("wp-submit")).click();
		
		String text=driver.findElement(By.className("app-promo__link")).getAttribute("title");
		
		Assert.assertEquals(text, "Try the desktop app!");
	}

}
