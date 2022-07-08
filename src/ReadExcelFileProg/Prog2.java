package ReadExcelFileProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream A1 = new FileInputStream("C:\\Users\\rahul\\eclipse-workspace\\Automation_Selenium_26Feb_Prog\\TestDataExcel1\\TestExcelFile.xlsx");

		Sheet excelsheet = WorkbookFactory.create(A1).getSheet("Sheet3") ;
/*
	for(int row=0;row<=2;row++)
	{
		for(int col=0;col<=3;col++)
		{
			 String value = excelsheet.getRow(row).getCell(col).getStringCellValue();
				System.out.print(value   +   "     ");
		}
		System.out.println();
	}

	*/
		System.out.println(excelsheet.getLastRowNum());
		System.out.println(excelsheet.getRow(0).getLastCellNum());
		
		for(int row=0;row<=excelsheet.getLastRowNum();row++)
		{
			for(int col=0;col<excelsheet.getRow(row).getLastCellNum();col++)
			{
				 String value = excelsheet.getRow(row).getCell(col).getStringCellValue();
					System.out.print(value   +   "     ");
			}
			System.out.println();
	} 
	}
}
