package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealWithTabs {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
	// get the new TAB in the same session 	
		driver.switchTo().newWindow(WindowType.TAB);
	// trigger the instagram URL in the new TAB
		driver.get("https://www.instagram.com");
		driver.close();
	// NoSuchElementException 
		driver.close();
	}
}
