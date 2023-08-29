package HandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionInDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
// Select 9 in DAY Dropdown	
		WebElement day = driver.findElement(By.id("day"));
		Select daySelect = new Select(day);
		daySelect.selectByVisibleText("9");
		
// Select September in MONTH Dropdown		
		WebElement month = driver.findElement(By.id("month"));
		Select monthSelect = new Select(month);
		monthSelect.selectByVisibleText("Sep");
		
// Select 1967 in YEAR Dropdown		
		WebElement year = driver.findElement(By.id("year"));
		Select yearSelect = new Select(year);
		yearSelect.selectByVisibleText("1967");
		
	}
}
