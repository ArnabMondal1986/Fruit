package objectRepositoryWP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WordPressObjects 
{
    WebDriver driver;
    //Defining objects for Home Page
    //By profNm = By.className("fbxWelcomeBoxBlock fbxWelcomeBoxSmallLeft fbxWelcomeBoxProfilePicBlock _8o _8r lfloat _ohe");
    By username = By.id("user_login");
    By password = By.id("user_pass");
    By login = By.id("wp-submit");
    By explorDis = By.className("empty-content__action button is-primary");
    By welcome = By.className("empty-content__title");
    
    //constructor
    public WordPressObjects(WebDriver driver){
    	
    	this.driver = driver;
    }
    
    public void credentials(String user, String pass){
    	driver.findElement(username).clear();
    	driver.findElement(username).sendKeys(user);
    	driver.findElement(password).clear();
    	driver.findElement(password).sendKeys(pass);
    }
    
    public void login(){
    	
    	driver.findElement(login).click();
    }
    
    public void validate() throws InterruptedException{
    	
    	WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(welcome));
    	String str= myDynamicElement.getText();
    	//Assert.assertEquals(str, "Welcome to the Reader");
    	Assert.assertTrue(str.contains("Welcome"));
        System.out.println("Login susscessfully");
    }
}
