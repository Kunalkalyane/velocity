package EXCELSHEETS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			 FileInputStream MyFile = new FileInputStream("C:\\Users\\DELL\\Desktop\\selenium\\Book1.xlsx");
			//String value=WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
			// String value1=WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
			double numericvalue = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
			 

			// System.out.println(value);
			System.out.println(numericvalue);
			 
			 
	
			 
			 

	}

}
