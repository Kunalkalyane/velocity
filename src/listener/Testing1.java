package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (listener.Listener.class)
public class Testing1 {
@Test
public void p()
{
	Reporter.log("TC p is running",true );
}

@Test
public void q()
{
	Assert.fail();
	
	Reporter.log("TC q is running",true);
}

@Test(dependsOnMethods= {"q"})
public void r()
{
	Reporter.log("TC r is running",true);
}
	
	

}
