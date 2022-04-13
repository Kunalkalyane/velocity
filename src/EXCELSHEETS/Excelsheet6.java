package EXCELSHEETS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream Myfile =new FileInputStream("C:\\Users\\DELL\\Desktop\\selenium\\Book1.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		CellType type1 = Mysheet.getRow(0).getCell(0).getCellType();
		CellType type2 = Mysheet.getRow(0).getCell(1).getCellType();
		CellType type3 = Mysheet.getRow(0).getCell(2).getCellType();


		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);

	String value1 = Mysheet.getRow(0).getCell(0).getStringCellValue();
	String value2 = Mysheet.getRow(0).getCell(1).getStringCellValue();
	 double value3 = Mysheet.getRow(0).getCell(2).getNumericCellValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		
		
		
		
		

	}

}
