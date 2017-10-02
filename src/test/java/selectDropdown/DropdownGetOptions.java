package selectDropdown;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownGetOptions {
	
WebDriver driver;
Select sel;

@Test
public void selectDrop(){
	
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement mon= driver.findElement(By.id("month"));
	sel = new Select(mon);
	
	List<WebElement> list_mon = sel.getOptions();
	int size=list_mon.size();
	System.out.println("Size of list" +size);
	
	for(WebElement ele:list_mon){
		System.out.println("Month "+ ele.getText());
	}
	driver.close();
}
}
