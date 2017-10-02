package dataDriven;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ExcelDataConfig;

import objectRepositoryWP.WordPressObjects;
import utility.ConfigReader;

public class WordPressDataExcel {
	
	WebDriver driver;
	WordPressObjects WPO;
	XSSFSheet sh;
	XSSFWorkbook wb;
	int rows;
	ConfigReader confRd;
			
	@BeforeMethod
	public void open() throws Exception{
		driver = new FirefoxDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		}
	
	@Test(dataProvider="passData")
    public void login(String usr, String pas) throws InterruptedException{
   	
   	driver.findElement(By.id("email")).clear();
   	driver.findElement(By.id("email")).sendKeys(usr);
   	driver.findElement(By.id("pass")).clear();
   	driver.findElement(By.id("pass")).sendKeys(pas);
   	driver.findElement(By.id("loginbutton")).click();
   	Thread.sleep(4000);
   	
   	if(driver.findElement(By.className("_2s25")).isDisplayed())
	{
	Assert.assertTrue(true);
    System.out.println("Login susscessfully");
	}
	else Assert.assertFalse(false);
	}
	
	 @DataProvider
	    public Object[][] passData() throws Exception{
		 
		 confRd= new ConfigReader();
		 ExcelDataConfig exd = new ExcelDataConfig(confRd.getExcelPath());
		 
		 rows = exd.rowcount("TestData");
		 Object[][] obj= new Object[rows][2];
		 
		 for(int i=0;i<rows;i++){
			 obj[i][0]=exd.getData("TestData",i,0);
			 obj[i][1]=exd.getData("TestData",i,1);
		 }
		 return obj;
	 }
   
	
	@AfterMethod
    public void tearDown(){
    	driver.quit();
    }
}