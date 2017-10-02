package javaScript;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WithoutSendkeys {
	 
	public static void main(String[] args) throws InterruptedException {
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("enter your application URL");

	((JavascriptExecutor)driver).executeScript("document.getElementById('some id').value='xyz'");
	 
	}
	 
	}