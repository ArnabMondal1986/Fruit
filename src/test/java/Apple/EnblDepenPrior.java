package Apple;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnblDepenPrior {
	
   @Test(dependsOnMethods={"ahost"},alwaysRun=true)
	
	public void guest(){
	    System.out.println("Test1");
		}
	
    @Test(priority=0)
	
	public void ahost(){
		System.out.println("Test2");
		}
    
   @Test(enabled=true,priority=2)
	
	public void bena(){
		System.out.println("Test3");
		Assert.assertTrue(true);
		}
   
   @Test(enabled=false)
	
	public void cnotena(){
		System.out.println("Test4");
		}
   
   @Test(priority=1,timeOut=5000)
	
	public void atimout(){
		System.out.println("Test5");
		}

}
