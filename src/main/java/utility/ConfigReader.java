package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties P;
	
	public ConfigReader(){
		try {
			P = new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\Rupa\\Desktop\\Selenium\\Project\\Fruit\\src\\main\\java\\utility\\global.properties");
			
			P.load(fis);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception is "+e.getMessage());
		} 
	}
	
	public String getbrowser(){
		return P.getProperty("browser");
	}
	
	public String getExcelPath(){
		return P.getProperty("excelPath");
	}
	
	public String getUrl(){
		return P.getProperty("url");
	}
	
	public String getUsername(){
		return P.getProperty("username");
	}
	
	public String getPassword(){
		return P.getProperty("password");
	}
	
	public String getChromeDriverPath(){
		return P.getProperty("ChromeDriverPath");
	}
	
	public String getIEDriverPath(){
		return P.getProperty("IEDriverPath");
	}
}
