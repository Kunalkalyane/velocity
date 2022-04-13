package EXCELSHEETS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile =new FileInputStream("C:\\Users\\DELL\\Desktop\\selenium\\Book1.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		int lastRowNumCount = Mysheet.getLastRowNum();
		System.out.println("rownum is"+lastRowNumCount);
		int totalnumberofrows = lastRowNumCount;
		
		short lastCellNum = Mysheet.getRow(0).getLastCellNum();
		System.out.println("last cellnumber is"+lastCellNum);
		int totalnumberofcolumns = lastCellNum-1;
		for(int i=0;i<=totalnumberofrows;i++)
		{
			for(int j=0;j<=totalnumberofcolumns;j++)
			{
				String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value +" ");
			}
			System.out.println();
		}
		

	}

}
