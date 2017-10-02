package hiddenWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HiddenElements {

	@Test
	public void WebElements(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> elements=driver.findElements(By.id("male"));
		int count=elements.size();
		
		for(int i=0;i<count;i++){
			
			WebElement ele=elements.get(i);
			int x=ele.getLocation().x;
			
			if(x!=0){
				ele.click();
				break;}
			}
		driver.close();
		}
	}
