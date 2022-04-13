package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledStudy {
	  @Test
	  public void a()
	  {
		  Reporter.log("running A method",true);
	  }
	 @Test(enabled=false)
	 public void c()
	 {
		 Reporter.log("running c method",true);
		 
	 }
	  
	 @Test
	 public void b()
	 {
		 Reporter.log("running b method",true);
	 }
  }

