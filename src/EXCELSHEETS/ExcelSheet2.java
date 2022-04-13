package EXCELSHEETS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("C:\\Users\\DELL\\Desktop\\selenium\\Book1.xlsx");
		

		Workbook test = WorkbookFactory.create(MyFile);
		Sheet MySheet = test.getSheet("Sheet1");
		Row MyRow = MySheet.getRow(4);
		Cell Mycell = MyRow.getCell(0);
		 String Myvalue = Mycell.getStringCellValue();
		System.out.println(MySheet.getRow(4).getCell(0).getStringCellValue());
		
		
		
		
		
		
		
		
	}

}
