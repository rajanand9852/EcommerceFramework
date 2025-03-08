package Ecommerce.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contains method to read the data from excel file
 */

public class ExcelFileUtility {
	
	public String toReadtheDatafromexcelFile(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(".//src/test/resources/Address.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		     String value = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		     return value;
		     
	}

	

	}


