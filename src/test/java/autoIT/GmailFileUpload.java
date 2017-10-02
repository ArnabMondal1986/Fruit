package autoIT;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailFileUpload {
	
	WebDriver driver = new FirefoxDriver();
		
	@Test
	public void fileUpload() throws Exception{
		driver.get("https://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("rupa.debnath1987@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Passwd")).sendKeys("sai_baba");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(6000);
		driver.findElement(By.id(":ib")).click();
		driver.findElement(By.id(":pi")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\Chutki\\Desktop\\Autoit\\Fileupload.exe");
		
	}
}
