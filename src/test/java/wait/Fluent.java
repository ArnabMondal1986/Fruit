package wait;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Fluent {

	@Test
	public void waitfluent(){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
	driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.pollingEvery(1, TimeUnit.SECONDS)
			.withTimeout(10, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	 

     WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	   
      public WebElement apply(WebDriver arg0) 
      {

WebElement ele = arg0.findElement(By.xpath("//p[@id='demo']"));

//Will capture the inner Text and will compare will WebDriver

//If condition is true then it will return the element and wait will be over

              if (ele.getAttribute("innerHTML").equalsIgnoreCase("WebDriver")) 
               {

                   System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));

                   return ele;
               }

//If condition is not true then it will return null and it will keep checking until condition is not true

else {
 System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));

    return null;
} }});

//If element is found then it will display the status

   System.out.println("Final visible status is >>>>> " + element.isDisplayed());

}
	}
