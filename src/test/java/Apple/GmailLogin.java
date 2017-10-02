package Apple;

import org.testng.annotations.Test;

import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class GmailLogin {
	
  WebDriver driver = new FirefoxDriver();
  
  @BeforeTest
  public void beforeMethod() {
	  String Url = "https://gmail.com";
	  driver.get(Url);
 }
  
  @BeforeMethod
public void Login() {
	  
	  WebElement usr = driver.findElement(By.id("Email"));
	  usr.clear();
	  usr.sendKeys("rupa.debnath1987@gmail.com");
	  driver.findElement(By.id("next")).click();
	  
	  WebElement myDynamicElement = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.id("Passwd")));
	  
	  //WebElement pas = driver.findElement(By.id("Passwd"));
	  myDynamicElement.clear();
	  myDynamicElement.sendKeys("sai_baba");
	  driver.findElement(By.id("signIn")).click();
	  
	  }
  
 @Test(priority=1, enabled=true)
  public void verifyUser() {
	  WebElement LogoutProfileBtn = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.gb_2a.gbii")));
	  LogoutProfileBtn.click();
	  
	  String actual = driver.findElement(By.cssSelector("div.gb_pb")).getText();
	  
	  Assert.assertEquals(actual,"rupa.debnath1987@gmail.com");
	  LogoutProfileBtn.click();

  }
  
  /*@Test(priority =2)
  public void verifyInbox() {
	  WebElement inbox = driver.findElement(By.cssSelector("a.J-Ke n0"));
	  inbox.click();
	  String actual = inbox.getText();
	  Assert.assertEquals(actual,"Inbox");
  }*/
  
  @AfterMethod
  public void Logout() {
	  WebElement ele = driver.findElement(By.cssSelector("span.gb_2a.gbii"));
	  ele.click();
	  WebElement Logoutbtn = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.id("gb_71")));
	  Logoutbtn.click();
  }
  
 @AfterTest
  public void Exit(){
	  
	  driver.close();
	  System.exit(0);
  }
}
