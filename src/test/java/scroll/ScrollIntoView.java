package scroll;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ScrollIntoView {
	
	WebDriver driver=new FirefoxDriver();
	WebElement element;
	JavascriptExecutor je = (JavascriptExecutor)driver;
	
	@Test
	public void scroll(){
	
	driver.get("http://timesofindia.indiatimes.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	element = driver.findElement(By.linkText("Sitemap"));

	je.executeScript("arguments[0].scrollIntoView(true);",element);
	
	element.click();
	}
	
	@Test
	public void scrollMul(){
		
	driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	element=driver.findElement(By.xpath(".//*[@id='mCSB_1_container']/p[13]"));
	
	je.executeScript("arguments[0].scrollIntoView(true);",element);
	
	String s=element.getText();
	
	Assert.assertEquals(s, "End of content.");
}
	@AfterTest
	public void end(){
		driver.close();
	}
}
