package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prioritystudy {

public class Annotationstudy1 {
  @Test(priority=1)
  public void a(){
	  Reporter.log("Runnning A METHOD",true);
	  
  }
  @Test(priority=2)
  public void c()
  {
	  Reporter.log("running C METHOD",true);
  }
  @Test(priority=1)
  public void b()
  {
	  Reporter.log("running b METHOD",true);
  }
}
}
