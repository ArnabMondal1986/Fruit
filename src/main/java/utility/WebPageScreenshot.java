package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebPageScreenshot {
	
	File src;
	
	public void captureScreenshot(WebDriver driver, String screenCap){
		
		try {
		 // now copy the  screenshot to desired location using copyFile method
		src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C:\\Users\\Rupa\\Desktop\\Selenium\\Screenshot\\"+screenCap+".png"));
		FileUtils.copyFile(src, new File("C:\\Users\\Rupa\\Desktop\\Selenium\\Project\\Fruit\\Screenshot\\"+screenCap+".png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
	}

}
