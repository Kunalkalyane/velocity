package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
public static String readDataFromExcel(int rowIndex,int coloumnIndex) throws EncryptedDocumentException, IOException {

	
	FileInputStream Myfile=new FileInputStream("C:\\Users\\DELL\\Desktop\\selenium\\Book1.xlsx");
	 Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
	String value = MySheet.getRow(rowIndex).getCell(coloumnIndex).getStringCellValue();
	 return value;
	 
}
public static void takeScreenshotAs(WebDriver driver,int TCID) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Dest=new File("C:\\Users\\DELL\\Desktop\\selenium\\Screenshot\\TC"+TCID+"Scrrenshot.png");

		FileHandler.copy(src, Dest);
		Reporter.log("screenshot taken for TC"+TCID,true);
}

}
