package Apple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class VerifyLink {
	
  WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod()throws Exception {
	  
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.creativebloq.com/web-design/best-404-pages-812505");
      List<WebElement> links=driver.findElements(By.tagName("a"));
	  
	  System.out.println("Total links are "+links.size());
	  
	  for(int i=0;i<links.size();i++)
	  {
	  
	  WebElement ele= links.get(i);
	  
	  String url=ele.getAttribute("href");
	  
	  verifyLinkActive(url);
  }
  }
  
  @Test
  public void verifyLinkActive(String linkUrl)throws IOException {
	  URL url = new URL(linkUrl);
	     
	     HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	     
	     httpURLConnect.setConnectTimeout(3000);
	     
	     httpURLConnect.connect();
	     
		 Assert.assertEquals(httpURLConnect.getResponseCode(),"200");
	    }

  @AfterMethod
  public void teardown() {
	  driver.quit();
  }

}
