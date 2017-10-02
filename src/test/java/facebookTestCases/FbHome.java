package facebookTestCases;
import org.testng.annotations.Test;
import objectRepositoryFB.PageObjects;
import objectRepositoryFB.ProfileObjects;
import utility.Testbase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class FbHome extends Testbase{
	
	//WebDriver driver;
	PageObjects Po;
	ProfileObjects Pro;
	  
  @BeforeMethod
  public void LoginFb() throws Exception {
	  //Creating objects means invoking constructor method of class
	  setUp();	  
	  Po = new PageObjects(driver);
	  Pro = new ProfileObjects(driver);
	  Po.loginUsr("rupadebnath87@gmail.com");
	  Po.loginPs("rupa_infosys");
	  Po.signIn();
	  Thread.sleep(4000);
	  /*Alert alert = driver.switchTo().alert();
	  alert.accept();*/
	  System.out.println("Logged successfully");
	  }
  
  @Test
  public void validateButtons(){
	  Pro.validateUpdtStatus();//validating Update Status button present or not.
	  //Pro.PrivValid(); //validating Privacy dropdown selects friends
	  }
  
  /*@Test
  public void validatePrivacySettings() throws InterruptedException{
	  Pro.PrivValid(); //validating Privacy dropdown selects friends
	  }*/
  
  @AfterMethod
  public void logOut() throws Exception {
	  Pro.Logout();
     }
  
  @AfterTest
  public void teardown(){
	closewin();
  }
}
