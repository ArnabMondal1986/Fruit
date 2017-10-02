package headlessBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HtmlUnitTesting{
	
 //download html jar and import in project to use headless testing		@Test

@Test
public void htmltest(){
	
//WebDriver driver= new HtmlUnitDriver();
WebDriver driver= new FirefoxDriver();
driver.get("http://google.com/");
String Title =driver.getTitle();
int TitleLn=driver.getTitle().length();

System.out.println("Title " + Title);
System.out.println("Length of title " + TitleLn);
Assert.assertTrue(true);
}
}
