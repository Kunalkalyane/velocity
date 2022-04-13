package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Listener  implements ITestListener{
  public void OnTestStart(ITestResult result) {
	  Reporter.log("your TC is started",true);
	  ITestListener.super.onTestStart(result);
	  
  }
  public void OnTestfailure(ITestResult result) {
	  Reporter.log("your TC is failed");
	  ITestListener.super.onTestFailure(result);

	  
  }
  
  
  
  public void  OnTestSkipped(ITestResult result) {
	  Reporter.log("Congrats your TC is passed",true);
	  ITestListener.super.onTestSkipped(result);
	  
  }
  public void OnTestSuccess(ITestResult result)
  {
	  Reporter.log("Congrats your TC is passed",true);
	  ITestListener.super.onTestSuccess(result);
  }
  
  
  
  
  }

