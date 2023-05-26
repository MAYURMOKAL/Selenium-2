package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rb.gy/xqb7r");
		System.out.println(driver.getCurrentUrl());
	}
}
