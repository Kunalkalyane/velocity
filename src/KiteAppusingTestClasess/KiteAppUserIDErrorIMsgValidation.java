package KiteAppusingTestClasess;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasses.BaseClass;
import KiteappusingPOMandDDF.KiteHomePage;
import KiteappusingPOMandDDF.Kiteloginpage;
import UtilityPackage.Kitepinpage;
import UtilityPackage.Utility;

public class KiteAppUserIDErrorIMsgValidation extends BaseClass {
Kiteloginpage login;
@BeforeClass
public void LaunchBrowser() {
	login=new Kiteloginpage(driver);
}
@BeforeMethod
public void logintoKiteApp() throws EncryptedDocumentException, IOException
{
	login.enteruserid(Utility.readDataFromExcel(0, 1));
	login.clickonloginbutton();
}
@Test
public void validateUserIderrorMsg() throws IOException
{
	int TCID=555;
	String expecteduserIderrorMsg=Utility.readDataFromExcel(0, 4);
	String ActualUserIderrorMsg=login.getuserIderrorMsg();
	
Assert.assertEquals(ActualUserIderrorMsg,expecteduserIderrorMsg,"Error msg is not matching");
Utility.takeScreenshotAs(driver, TCID);

}
@AfterClass
public void browserClosing()
{
	closeBrowser();
}


	
	
	
}
