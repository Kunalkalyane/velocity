package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.Listener.class)
public class Testing {
  @Test
  public void a() {
	  Reporter.log("Tc a is running",true);
  }
  @Test
  public void b()
  {
	Assert.fail();
	Reporter.log("Tc b is running",true);  
  }
  @Test( dependsOnMethods={"b"})
  public void c() {
  Reporter.log("Tc  C is running",true);
}
}
