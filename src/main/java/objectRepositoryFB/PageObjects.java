package objectRepositoryFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects 
{
    WebDriver driver;
    //Defining objects for Home Page
    By username = By.id("email");
    By password = By.id("pass");
    By login = By.id("loginbutton");
    By firstname = By.name("firstname");
    By lastname = By.name("lastname");
    By birthMon = By.id("month");
    By birthDay = By.id("day");
    By birthYr = By.id("year");
    By passReset = By.linkText("Forgot your password?");
    By email = By.name("reg_email__");
    
    //constructor
    public PageObjects(WebDriver driver){
    	
    	this.driver = driver;
    }
    
    public void loginUsr(String userid){
    	driver.findElement(username).clear();
    	driver.findElement(username).sendKeys(userid);
    }
    
    public void loginPs(String pass){
    	driver.findElement(password).clear();
    	driver.findElement(password).sendKeys(pass);   	
    }
    
    public void signIn(){
    	driver.findElement(login).click();   	
    }

}
