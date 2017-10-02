package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver;
	
	@Test
	public void dragAnddrop(){
		
		driver = new FirefoxDriver();
		
		driver.get("http://demoqa.com/droppable/");
		
		WebElement src=driver.findElement(By.id("draggableview"));
		
		WebElement des=driver.findElement(By.id("droppableview"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src, des).build().perform();
	}

}
