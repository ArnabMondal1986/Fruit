package objectRepositoryFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfileObjects 
{
    WebDriver driver;
    //Defining objects for Home Page
    //By profNm = By.className("fbxWelcomeBoxBlock fbxWelcomeBoxSmallLeft fbxWelcomeBoxProfilePicBlock _8o _8r lfloat _ohe");
    By updtStatus = By.cssSelector("span._5qtp");
    By addPhoto = By.name("composer_photo[]");
    By createPhoto = By.name("js_m");
    By visible = By.cssSelector("span._55pe");
    By friendPriv = By.cssSelector("span.54nh _48u0");
    By AccSettDropDown = By.id("userNavigationLabel");
    By logOut = By.cssSelector("span._54nh");
    //By logOut = By.cssSelector("li._54ni navSubmenu __MenuItem");
    //By logOut = By.xpath("//div[@id='u_a_1']/div/div/div/div/div/ul/li[12]/a/span/span");
    
    //constructor
    public ProfileObjects(WebDriver driver){
    	
    	this.driver = driver;
    }
    
    public void validateUpdtStatus(){
    	WebElement myDynamicElement = (new WebDriverWait(driver, 10))
  			  .until(ExpectedConditions.presenceOfElementLocated(updtStatus));
    	//String expected = driver.findElement(updtStatus).getText();
  		String expected=myDynamicElement.getText();	  
    	Assert.assertEquals(expected,"Update Status");
    }
    
   public void PrivValid() throws Exception{
	    WebElement myDynamicfriend = (new WebDriverWait(driver, 10))
	  			  .until(ExpectedConditions.presenceOfElementLocated(visible));
	    myDynamicfriend.click();
	    Thread.sleep(2000);
    	String exp=driver.findElement(friendPriv).getText();
    	Assert.assertTrue(exp.contains("Friends"));
    }
   
    public void Logout() throws Exception{
    	
    	driver.findElement(AccSettDropDown).click();
    	Thread.sleep(2000);
    	WebElement myDynamicLogout = (new WebDriverWait(driver, 10))
    			  .until(ExpectedConditions.presenceOfElementLocated(logOut));
    	myDynamicLogout.click();
    }
 }
