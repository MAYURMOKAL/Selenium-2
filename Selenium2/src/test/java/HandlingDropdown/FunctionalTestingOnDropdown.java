package HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalTestingOnDropdown {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/signup");
// Identify all dropdowns which are visible
	 List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
	for (WebElement dropdown : allDropdowns) {
	// Pick only Visible Dropdowns
		
		if (dropdown.isDisplayed()) {
			Select dropdownSelect = new Select(dropdown);
			List<WebElement> allOptions = dropdownSelect.getOptions();
			for (WebElement option : allOptions) {
				dropdownSelect.selectByVisibleText(option.getText());
				if (option.isSelected()) {
					System.out.println(option.getText() + " is Selected ");
				} else {
					System.out.println(option.getText() + " is not Selected ");
				}
			}
		} 
	}
	driver.manage().window().minimize();
	driver.quit();
	
}
}
