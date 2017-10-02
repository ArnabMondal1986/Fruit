package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTable {
	
WebDriver driver;
	
@Test
public void web() throws Exception{
driver=new FirefoxDriver();

driver.get("https://www.redbus.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.className("modalCloseSmall")).click(); //window appears after opening browser so closing it
Thread.sleep(2000);
driver.findElement(By.id("txtOnwardCalendar")).click();
		
List<WebElement> dates=driver.findElements(By.xpath(".//*[@id='rbcal_txtOnwardCalendar']/table[2]//td"));
int count=dates.size();

for(int i=0;i<count;i++){
	String date = dates.get(i).getText();
	if(date.equalsIgnoreCase("17")){
	dates.get(i).click();
	break;
	}
	}
}
}
