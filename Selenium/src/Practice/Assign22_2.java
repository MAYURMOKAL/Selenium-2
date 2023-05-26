package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebDriverMethods.GetTitle;

public class Assign22_2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chat.openai.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
