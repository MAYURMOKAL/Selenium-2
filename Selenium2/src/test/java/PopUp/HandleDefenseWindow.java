package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDefenseWindow {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.pib.gov.in/");
// Handle PIB Alert PopUp
		driver.switchTo().alert().accept();
		
		String pibWid = driver.getWindowHandle();
		WebElement defence = driver.findElement(By.linkText("Ministry of Defence"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(defence).pause(2000).perform();
		wait.until(ExpectedConditions.elementToBeClickable(defence)).click();
		System.out.println(wait.until(ExpectedConditions.alertIsPresent()).getText());	
//Handle Defense Confirmation PopUp
		driver.switchTo().alert().accept();
		
		for (String wid : driver.getWindowHandles()) {
			if (driver.switchTo().window(wid).getCurrentUrl().contains("https://www.mod.gov.in")) {
				driver.close();
			}
		}
		driver.switchTo().window(pibWid).manage().window().minimize();
		driver.quit();
		
	}
}
