package TestNGStudy;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test case is passed");
	 
  }
  @Test
  public void firstprogram()
  {
	  System.out.println("this is the first pprogram of TestNG");
  }
  @Test
  public void addition()
  {
	  int a=10,b=20,sum;
	  sum=a+b;
System.out.println("sum is "+sum);
  }
  
}
