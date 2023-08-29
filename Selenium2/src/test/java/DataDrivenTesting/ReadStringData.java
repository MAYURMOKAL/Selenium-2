package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadStringData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	// Create the object and specify the address of the file to the Object
		FileInputStream fis = new FileInputStream("./src/test/resources/MyBook.xlsx");
	// Open the file
		Workbook workbook = WorkbookFactory.create(fis);
	// Specify the sheet name
		Sheet sheet = workbook.getSheet("selenium");
	// Specify the Row
		Row row = sheet.getRow(0);
	// Specify the Cell
		Cell cell = row.getCell(2);
	// Read the String Data
		String cellData = cell.getStringCellValue();
		System.out.println(cellData);
		workbook.close();
	}
}
