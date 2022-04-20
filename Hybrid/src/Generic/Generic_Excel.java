package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel {

	public static String getData(String sheet,int row, int cell) throws EncryptedDocumentException, IOException
	{
		String val="";
		FileInputStream n=new FileInputStream("./excel/Advance.xlsx");
		Workbook b = WorkbookFactory.create(n);
		Cell c=b.getSheet(sheet).getRow(row).getCell(cell);
		 val=c.getStringCellValue();
		 return val;
		
	}
}
