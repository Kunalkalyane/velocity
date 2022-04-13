package KiteappusingPOMandDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		FileInputStream Myfile =new FileInputStream("C:\\Users\\DELL\\Desktop\\selenium\\Book1.xlsx");

		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
		
		String myUSerID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String myPassword = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String myPin = Mysheet.getRow(0).getCell(2).getStringCellValue();


		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incongnito");
		WebDriver driver=new ChromeDriver(opt);

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
Kiteloginpage login= new Kiteloginpage(driver);
		
		login.enteruserid(myUSerID);
		login.Enterpasword(myPassword);
		login.clickonloginbutton();
		Thread.sleep(1000);

		Kitepinpage pin=new Kitepinpage(driver);
		pin.Enterpin(myPin);
		pin.clickoncontinue();
		
		
		KiteHomePage home=new KiteHomePage(driver);
		ChromeOptions opt1=new ChromeOptions();
		opt.addArguments("incongnito");
		home.validateuserID(myUSerID);
		home.logoutButton();
		driver.close();
		

	}

}
