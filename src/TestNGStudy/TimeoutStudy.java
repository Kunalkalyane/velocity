package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutStudy {
	  @Test
	  public void a()
	  {
		  Reporter.log("running A method",true);
	  }
	 @Test(timeOut=1000)
	 public void c() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 Reporter.log("running c method",true);
		 
	 }
	  
	 @Test
	 public void b()
	 {
		 Reporter.log("running b method",true);
	 }
}
