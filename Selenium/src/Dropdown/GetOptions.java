package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		boolean b = false;
		driver.get("C:\\Users\\mayur\\Desktop\\Dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select select = new Select(city);
		List<WebElement> allOptions = select.getOptions();
		
		for (WebElement singleOption : allOptions) {
			
	// Checking whether the city name is in Dropdown
			
			if (singleOption.getText().equals("Pune")) {
				singleOption.click();
				System.out.println("Valid Choice Clicked");
				b = true;
				break;
			}	
			else {
				continue;
			}
		}	
			
			if (b == false) {
				System.out.println("Invalid Choice");
			}
	}
}
