package HandlingDropdown;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderAndSpellingCheckOfAllOptions {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		List<String> actualDayOptions = new ArrayList<String>();
		List<String> actualMonthOptions = new ArrayList<String>();
		List<String> actualYearOptions = new ArrayList<String>();
		List<String> expectedDayOptions = new ArrayList<String>();
		List<String> expectedMonthOptions = new ArrayList<String>();
		List<String> expectedYearOptions = new ArrayList<String>();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
// Identify All Dropdowns which are Visible
		List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
		for (WebElement dropdown : allDropdowns) {	
// Pick only Visible Dropdowns
			if (dropdown.isDisplayed()) {
				Select dropdownSelect = new Select(dropdown);
				List<WebElement> allOptions = dropdownSelect.getOptions();
				for (WebElement option : allOptions) {
					if (dropdown.getAttribute("title").equals("Day")) {
						String dayOptions = option.getText();
						actualDayOptions.add(dayOptions);	
					} else if (dropdown.getAttribute("title").equals("Month")) {
						String monthOptions = option.getText();
						actualMonthOptions.add(monthOptions);
					} else if (dropdown.getAttribute("title").equals("Year")) {
						String yearOptions = option.getText();
						actualYearOptions.add(yearOptions);
					}
				}
			}	
		}
		FileInputStream fis = new FileInputStream("./src/test/resources/MyBook.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("dropdowndata");
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
					expectedMonthOptions.add(stringCellValue);
				}else if (String.valueOf(cellType).equals("NUMERIC")) {
					long numericCellValue = (long)consideredRow.getCell(j).getNumericCellValue();
					if (consideredRow.getLastCellNum() == 32) {
						expectedDayOptions.add(String.valueOf(numericCellValue));
					} else if (consideredRow.getLastCellNum() == 120) {
						expectedYearOptions.add(String.valueOf(numericCellValue));
					}
				}
			}
		}
			workbook.close();
			if (expectedDayOptions.equals(actualDayOptions)) {
				System.out.println("Pass: The Day options order and spelling is correct");
				System.out.println(expectedDayOptions);
				System.out.println(actualDayOptions);
			} else {
				System.out.println("Fail: The Day options order and spelling is incorrect");
				System.out.println(expectedDayOptions);
				System.out.println(actualDayOptions);
			}
			if (expectedMonthOptions.equals(actualMonthOptions)) {
				System.out.println("Pass: The Month options order and spelling is correct");
				System.out.println(expectedMonthOptions);
				System.out.println(actualMonthOptions);
			} else {
				System.out.println("Fail: The Month options order and spelling is incorrect");
				System.out.println(expectedMonthOptions);
				System.out.println(actualMonthOptions);
			}
			if (expectedYearOptions.equals(actualYearOptions)) {
				System.out.println("Pass: The Year options order and spelling is correct");
				System.out.println(expectedYearOptions);
				System.out.println(actualYearOptions);
			} else {
				System.out.println("Fail: The Year options order and spelling is incorrect");
				System.out.println(expectedYearOptions);
				System.out.println(actualYearOptions);
			}
			driver.manage().window().minimize();
			driver.quit();

	}
}
