package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData {
	
	WebDriver driver=new FirefoxDriver(); 
	TestDataFetch TDF = new TestDataFetch("C:\\Users\\Rupa\\Desktop\\Selenium\\TestData.xlsx");
	
	@Test(dataProvider="info")
	
	public void fbLogin(String usrnm, String pass){
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(usrnm);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("u_0_n")).click();
		
	}
	
	@DataProvider(name="info")
	public Object[][] getData(){
		
		int rowCnt=TDF.rowNum("TestData");
		
		Object[][] obj= new Object[rowCnt][2];
		
		for(int i=0; i<rowCnt;i++){
		
		obj[i][0]=TDF.getData("TestData", 0, i);
		obj[i][1]=TDF.getData("TestData", 1, i);
		}
		
		return obj;
		}
	}
