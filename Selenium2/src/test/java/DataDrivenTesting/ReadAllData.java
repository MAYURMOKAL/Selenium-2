package DataDrivenTesting;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllData {
	public static void main(String[] args) throws Throwable {
		List<String> expectedDayList = new ArrayList<String>();
		List<String> expectedMonthList = new ArrayList<String>();
		List<String> expectedYearList = new ArrayList<String>();
		
		
		FileInputStream fis = new FileInputStream("./src/test/resources/MyBook.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("dropdowndata");
		
// getFirstRowNum() will give the index of the First Row in the form of Index.
//		int firstRowNum = sheet.getFirstRowNum(); 
//		System.out.println(firstRowNum);
	
// getLastRowNum() will give the index of the Lasr Row in the form of the Index.
//		int lastRowNum = sheet.getLastRowNum(); 
//		System.out.println(lastRowNum);

//		Row row = sheet.getRow(0);
		
// getFirstCellNum() will give the Index of the First Cell in the Considered Row.
//		 short firstCellNum = row.getFirstCellNum(); 
//		 System.out.println(firstCellNum);
		
// getLastCellNum() will give the index + 1 = Count of the Last Cell in the considered Row
//		 short lastCellNum = row.getLastCellNum(); 
//		 System.out.println(lastCellNum);

	int firstRowIndex = sheet.getFirstRowNum();
	int lastRowIndex = sheet.getLastRowNum();
	for (int i = firstRowIndex; i <= lastRowIndex; i++) {
		Row consideredRow = sheet.getRow(i);
		short firstCellIndex = consideredRow.getFirstCellNum();
		short lastCellCount = consideredRow.getLastCellNum();
		for (int j = firstCellIndex + 1; j < lastCellCount; j++) {
			CellType cellType = consideredRow.getCell(j).getCellType();
			if (String.valueOf(cellType).equals("STRING")) {
				String stringCellValue = consideredRow.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				expectedMonthList.add(stringCellValue);
				
			} else if (String.valueOf(cellType).equals("NUMERIC")) {
				long numericCellValue = (long)consideredRow.getCell(j).getNumericCellValue();
				System.out.println(numericCellValue);
//				System.out.println(consideredRow.getLastCellNum());
				if (consideredRow.getLastCellNum() == 32) {
					expectedDayList.add(String.valueOf(numericCellValue));
				} else if (consideredRow.getLastCellNum() == 120) {
					expectedYearList.add(String.valueOf(numericCellValue));
				}
			}
		}
	}
	workbook.close();
	}
}
