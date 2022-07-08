package ReadExcelFileProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog1 {

	public static void main(String[] args) throws  IOException {

			FileInputStream file = new FileInputStream("C:\\Users\\rahul\\eclipse-workspace\\Automation_Selenium_26Feb_Prog\\TestDataExcel1\\TestExcelFile.xlsx");

			 Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
			 
			 String value = excel.getRow(0).getCell(0).getStringCellValue();
			 String value1 = excel.getRow(0).getCell(1).getStringCellValue();
	
			 //		  int value2 = (int) excel.getRow(0).getCell(2).getNumericCellValue();

			 String value2 = excel.getRow(0).getCell(2).getStringCellValue();

			System.out.print(value + "  "  +  value1 + "   "  +  value2  );
			
	//		System.out.println(value1);

	
	}

}
