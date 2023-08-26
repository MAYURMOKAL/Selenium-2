package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverControlTransfer {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.youtube.com");
		Set<String> allWindowsId = driver.getWindowHandles();
		for (String wid : allWindowsId) {
			String windowURL = driver.switchTo().window(wid).getCurrentUrl();
			if (windowURL.equals("https://www.facebook.com")) {
				driver.findElement(By.name("login")).click();
			} else if (windowURL.equals("https://www.google.com")) {
				driver.close();
			} else if (windowURL.equals("https://www.youtube.com")) {
				driver.manage().window().maximize();
			}

		}
	}
}
