package basicOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Constant_Values
{
	public static String excelData(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excel_path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheetname);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
		
	}
}
