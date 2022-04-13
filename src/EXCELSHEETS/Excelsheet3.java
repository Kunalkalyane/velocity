package EXCELSHEETS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream  myfile=new FileInputStream("C:\\Users\\DELL\\Desktop\\selenium\\Book1.xlsx");
		 
Sheet Mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
for(int i=0;i<=3;i++)
{
	String value = Mysheet.getRow(0).getCell(i).getStringCellValue();
	System.out.println(value);
	
	
}
	}

}
