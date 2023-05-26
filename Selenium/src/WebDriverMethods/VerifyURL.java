package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";

		if (expectedURL.equals(actualURL))
			System.out.println("PASS");
		else
			System.out.println("FAIL");
	}
}
