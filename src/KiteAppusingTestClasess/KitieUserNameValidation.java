package KiteAppusingTestClasess;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasses.BaseClass;
import UtilityPackage.KiteHomePage;
import UtilityPackage.Kiteloginpage;
import UtilityPackage.Kitepinpage;
import UtilityPackage.Utility;

public class KitieUserNameValidation extends BaseClass {

	Kiteloginpage login;
	Kitepinpage pin;
	KiteHomePage home;
	
	@BeforeClass 
	public void  Browserlaunch()
	{
		
	launchBrowser();
	login=new Kiteloginpage(driver);
	pin=new Kitepinpage(driver);
	home=new KiteHomePage(driver);
	
}
	@BeforeMethod
	public void logintoKiteApp() throws EncryptedDocumentException, IOException
	{
		
		login.enteruserid(Utility.readDataFromExcel(0, 0));
		login.Enterpasword(Utility.readDataFromExcel(0, 1));
		login.clickonloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.Enterpin(Utility.readDataFromExcel(0, 2));
		pin.clickoncontinue();
		
	}
	
	
	@Test
	public void validateUserName() throws EncryptedDocumentException, IOException
	{
		int TCID=100;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String ActualUserID=home.actualuserID(null);
		String expectedUserID=Utility.readDataFromExcel(0, 3);
		Assert.assertEquals(expectedUserID,ActualUserID ,"actual and Expected user id is not matched");
		Utility.takeScreenshotAs(driver, TCID);
		Reporter.log("Validated UserName",true);
	}
		
		@AfterMethod
		public void logoutFromKiteApp() throws InterruptedException
		{
		home.logoutButton();
		Reporter.log("Logging out",true);
	}
	
		@AfterClass
		public void closingBrowser()
		{
			closeBrowser();
		}

		
		
	}
	
	
	
	
	


