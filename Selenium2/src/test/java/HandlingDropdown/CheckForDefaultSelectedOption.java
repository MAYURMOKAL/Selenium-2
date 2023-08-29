package HandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckForDefaultSelectedOption {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
// Identify the DAY dropdown
		WebElement day = driver.findElement(By.id("day"));
		Select daySelect = new Select(day);
		String selectedDayOption = daySelect.getFirstSelectedOption().getText();
		System.out.println("selectedDayOption = " + selectedDayOption);
// Identify the MONTH dropdown
		WebElement month = driver.findElement(By.id("month"));
		Select monthSelect = new Select(month);
		String selectedMonthOption = monthSelect.getFirstSelectedOption().getText();
		System.out.println("selectedMonthOption = " + selectedMonthOption);
// Identify the YEAR dropdown
		WebElement year = driver.findElement(By.id("year"));
		Select yearSelect = new Select(year);
		String selectedYearOption = yearSelect.getFirstSelectedOption().getText();
		System.out.println("selectedYearOption = " + selectedYearOption);
		driver.manage().window().minimize();
		driver.quit();
	}
}
