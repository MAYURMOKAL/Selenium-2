package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebDriverMethods.GetTitle;

public class Assign22_5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
