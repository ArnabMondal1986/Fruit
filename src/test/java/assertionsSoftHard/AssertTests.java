package assertionsSoftHard;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTests {
	//Examples of soft/hard assert
	@Test
	public void softAssertions(){
		
		SoftAssert asserts = new SoftAssert();
		
		//SoftAssert assert=new SoftAssert();
		System.out.println("Test 1 started");
		asserts.assertEquals(16, 1);
	    System.out.println("Test 1 completed");
	    asserts.assertAll();
	    
	}
	
	@Test
	public void hardAssertions(){
		 System.out.println("Test 2 started");
		Assert.assertEquals(15, 16);
		System.out.println("Test 2 completed");
	}

}
