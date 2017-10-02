package tooltip;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class TooltipHov {
	
@Test
public void tool() throws Exception {
 
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
driver.findElement(By.id("GmailAddress")).click();

WebElement ele = (new WebDriverWait(driver, 10))
.until(ExpectedConditions.presenceOfElementLocated(By.className("jfk-bubble-content-id")));

Actions act = new Actions(driver);
act.moveToElement(ele).build().perform();
String text=ele.getText();

Assert.assertEquals(text, "You can use letters, numbers, and periods.");
driver.close();
	}
 }