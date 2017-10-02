package selectDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	
WebDriver driver;
Select sel;

@Test
public void selectDrop(){
	
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement mon= driver.findElement(By.id("month"));
	sel = new Select(mon);
	sel.selectByValue("2");
	
	WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
	sel = new Select(day);
	sel.selectByVisibleText("11");
	
	WebElement yr=driver.findElement(By.name("birthday_year"));
	sel = new Select(yr);
	sel.selectByIndex(1);
	
	driver.close();
}
}
