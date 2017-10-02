package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameEle {
	
	WebDriver driver;
	
	@BeforeTest
	public void start(){
		driver= new FirefoxDriver();
		driver.get("https://dev16230.service-now.com/navpage.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void fram(){
		
		int frame_num=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames ="+frame_num);
		
		WebElement ele = driver.findElement(By.xpath("//iframe[@title='Main Content']"));
		driver.switchTo().frame(ele);//searching frame with element		
		driver.switchTo().defaultContent();
	}
	
	@Test
	public void framNa(){
		driver.switchTo().frame("gsft_main"); //searching frame with name
		driver.findElement(By.id("user_name")).sendKeys("abc");
		driver.findElement(By.id("user_password")).sendKeys("abc");
		
		driver.switchTo().defaultContent();
	}
	

}
