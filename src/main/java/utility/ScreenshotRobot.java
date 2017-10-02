package utility;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
 
import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
 
public class ScreenshotRobot {
 
 public void captureScreenshot(WebDriver driver, String screenCap) throws Exception, Exception
 {
 
// This code will capture screenshot of current screen 
BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
     
// This will store screenshot on Specific location
ImageIO.write(image, "png", new File("C:\\Apps\\Fruit\\Screensht\\"+screenCap+".png")); 
 
 }
 
}