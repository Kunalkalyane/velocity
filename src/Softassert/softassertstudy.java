package Softassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class softassertstudy {
	SoftAssert s=new SoftAssert();
	
  @Test
  public void mymethod1()  {
	  String a="kunal";
	  String b="Kunal1";
	  s.assertNotNull(b,"b is null");
	  s.assertNotEquals(b,"a and b are matching");
	  s.assertAll();
	  
  }
}
