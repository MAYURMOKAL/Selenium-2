package HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IdentifyAllDropdownsInOneShot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
// Identify all dropdowns in one shot
		List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
// No. of dropdowns in the webpage
		System.out.println(allDropdowns.size());
		for (WebElement SingleDropdown : allDropdowns) {
			if(SingleDropdown.isDisplayed()) {
				System.out.println("Boolean True - Dropdown Visible");
				Select visibleDropdown = new Select(SingleDropdown);
					if (visibleDropdown.isMultiple()) {
						System.out.println(SingleDropdown.getAttribute("title") + " Boolean True - MultiSelect Dropdown");
					} else {
							System.out.println(SingleDropdown.getAttribute("title") + " Boolean False - SingleSelect Dropdown");
							}
						}
			else {
					System.out.println("Boolean False - Dropdown Not Visible");	
				}
			}
		}
		
	}

