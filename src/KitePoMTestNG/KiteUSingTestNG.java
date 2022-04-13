package KitePoMTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteUSingTestNG {
	
	
	WebDriver driver; 
	org.apache.poi.ss.usermodel.Sheet Mysheet;
	LoginPage login;
	PinpageforTestNG pin;
	HomePageforTestNG home;
	@BeforeClass
	public void launchbrowser() throws EncryptedDocumentException, IOException
	{
	Reporter.log("Launching Browser",true);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifiactions");
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.manage().window().maximize();

	Reporter.log("Browserlaunched success",true);
	 FileInputStream MyFile = new FileInputStream("C:\\Users\\DELL\\Desktop\\selenium\\Book1.xlsx");
Mysheet =WorkbookFactory.create(MyFile).getSheet("Sheet4");
login=new LoginPage(driver);
pin=new PinpageforTestNG(driver);
home=new HomePageforTestNG(driver);
	}
	
	
	
	@BeforeMethod
	public void loginTokiteApp()
	{
		String UserID =Mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD =Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN =Mysheet.getRow(0).getCell(2).getStringCellValue();
		Reporter.log("Entering Userid and PassWord",true);
		login.enteruserid(UserID);
		login.Enterpasword(PWD);
		login.clickonloginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Entering PIN",true);
		pin.Enterpin(PIN);
		pin.clickoncontinue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
		@Test
		
		public void validateUserID1()
		{
			Reporter.log("Validating userID",true);
			String ActualUserID=home.getActualUserID();

			String ExpectedUserID =Mysheet.getRow(0).getCell(0).getStringCellValue();

			if(ActualUserID.equals (ExpectedUserID)) {
				System.out.println("USER ID MATCH tc is PASSED");
				Assert.assertEquals(ActualUserID, ExpectedUserID,"actual adn expected user id is not matching");
				Reporter.log("user id validated succesfully,TC is passed",true );
				
			}
		}
			
			@AfterMethod
			
			public void logouttoKiteapp() throws InterruptedException {
			Reporter.log("logging out...",true);
			home.logoutButton();
		}
		
			
			
			@AfterClass
			public void closebrowser()
			{
				Reporter.log("closing browser",true);
				driver.close();
			}
			
}
				
			

			
			
			
		
		
	


	
		

	
	
	
	
	
	
		
	



  

