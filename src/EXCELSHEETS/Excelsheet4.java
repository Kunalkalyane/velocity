package EXCELSHEETS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\DELL\\Desktop\\selenium\\Book1.xlsx");

		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		for(int i=0;i<=4;i++)
		{
		for(int j=0;j<=3;j++)
		{
			String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(value+" ");
		}
		System.out.println();
		}
	}

}
