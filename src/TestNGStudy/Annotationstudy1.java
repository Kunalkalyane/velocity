package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotationstudy1 {
  @Test
  public void a(){
	  Reporter.log("Runnning A METHOD",true);
	  
  }
  @Test
  public void c()
  {
	  Reporter.log("running C METHOD",true);
  }
  @Test
  public void b()
  {
	  Reporter.log("running b METHOD",true);
  }
  
  
}
