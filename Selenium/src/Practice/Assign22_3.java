package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign22_3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://play.google.com/store/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
