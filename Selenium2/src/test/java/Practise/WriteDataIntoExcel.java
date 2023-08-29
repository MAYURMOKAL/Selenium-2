package Practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
	public void createNumericData(String sheetName, int rowIndex, int cellIndex, double value) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Create.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		workbook.createSheet(sheetName).createRow(rowIndex).createCell(cellIndex).setCellValue(value);
		FileOutputStream fos = new FileOutputStream("./src/test/resources/Create.xlsx");
		
//		int a[][]= { {1,2,3,4,5,6,7,8}, {11,22,33,44,55,66,77,88} };
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				int b=a[i][j];
//			}
//		}
		workbook.write(fos);
		workbook.close();
		System.out.println("successfully added");
	}
	
	public double readNumericData(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Create.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		double value = workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
		return value;
	}
}
