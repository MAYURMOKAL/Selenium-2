package WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class DealWithWindowIDAndWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	// Maximize The Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// Pass The Main URL
		driver.get("https://www.facebook.com");
	// Ger The FacebookWindow ID
		String facebookid = driver.getWindowHandle();
		System.out.println("Facebook Window ID = " + facebookid);
		Thread.sleep(4000);
	// Create one more Window with the same browser object reference
		driver.switchTo().newWindow(WindowType.WINDOW);
	// Trigger thr URL in the latest new window
		driver.get("https://www.instagram.com");
	// Get instagram ID
		String instagramid = driver.getWindowHandle();
		System.out.println("Instagram Window ID = " + instagramid);
	// Get All windows ID in the Session
		Set<String> allWindowsID = driver.getWindowHandles();
	// Check the no. od Windows ID
		System.out.println(allWindowsID.size());
		System.out.println(allWindowsID);
	// Iterate one window ID
		for (String wid : allWindowsID) {
			System.out.println(wid);
		}
	}
}
