package PopUp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Check {
	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		options.addArguments("--disable-notifications");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		try {
			driver.get("https://www.pib.gov.in/");
// Capture the PIB Alert Message
			System.out.println(driver.switchTo().alert().getText());
// Handle the PIB Alert Popup
			driver.switchTo().alert().accept();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement defense = driver.findElement(By.linkText("Ministry of Defence"));
			wait.until(ExpectedConditions.elementToBeClickable(defense));
			Actions actions = new Actions(driver);
			actions.scrollToElement(defense).pause(2000).click(defense).perform();

// Capture the Defense Confirmation Message
			System.out.println(driver.switchTo().alert().getText());
// Handle the Defense Confirmation Message
//		driver.switchTo().alert().dismiss();
			driver.switchTo().alert().accept();

			for (String wid : driver.getWindowHandles()) {
				String windowURL = driver.switchTo().window(wid).getCurrentUrl();
				if (windowURL.contains("https://pib.gov.in/")) {

				} else if (windowURL.contains("https://mod.gov.in/")) {
					driver.close();
				}
			}
			driver.navigate().refresh();
			driver.manage().window().minimize();
			driver.quit();

		} catch (WebDriverException e) {
//			driver.navigate().refresh();
		}
	}
}
