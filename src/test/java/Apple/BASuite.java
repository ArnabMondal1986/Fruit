package Apple;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BASuite {
	
	@BeforeSuite
	public void befsuit(){
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void aftsuit(){
		System.out.println("After Suite");
	}

}
