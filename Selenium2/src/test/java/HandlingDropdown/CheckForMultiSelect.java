package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckForMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/mayur/Desktop/SeleniumFile/MultiSelectDropdown.html");
// Identify the Dropdown
		WebElement dropdown = driver.findElement(By.id("cars"));
// Create the Select Class Object
		Select dropdownSelect = new Select(dropdown);
// Check the Type of the Dropdown
		if (dropdownSelect.isMultiple()) {
			System.out.println("Booleam True : Multi Select Dropdown");
		}else {
			System.out.println("Boolean False : Single Select Dropdown");
		}
// Select Fortuner and Creta Options
		dropdownSelect.selectByValue("2");
		Thread.sleep(3000);
		dropdownSelect.selectByValue("3");
		Thread.sleep(3000);
// Get All Selected Options in List Box(Dropdown)
	List<WebElement> allSelectedOptions = dropdownSelect.getAllSelectedOptions();
	System.out.println("No. of Selected Options in the List Box : " + allSelectedOptions.size());
	for (WebElement singleOption : allSelectedOptions) {
		System.out.println(singleOption.getText());
	}
// What ?
//	System.out.println(dropdownSelect.getWrappedElement().getText());
//	Thread.sleep(4000);
// Deselect Fortuner
	dropdownSelect.deselectByValue("2");
	Thread.sleep(4000);
// Dselect All Selected Options
	dropdownSelect.deselectAll();
	Thread.sleep(4000);
	
	driver.manage().window().minimize();
	driver.quit();
	
	}
}
