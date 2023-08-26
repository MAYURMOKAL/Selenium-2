package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardSimulation {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com");
	// Identify the active element in the webpage
		WebElement username = driver.switchTo().activeElement();
	// Append the input in the usename active element
		username.sendKeys("Seleniuum");
	// Move the control to password textfield by using TAB
		username.sendKeys(Keys.TAB + "1234567");
		Thread.sleep(2000);
	// Move the control to the Login Button
		driver.switchTo().activeElement().sendKeys(Keys.TAB , Keys.TAB);
//			OR
//		driver.switchTo().activeElement().sendKeys(Keys.TAB + Keys.chord(Keys.TAB));
	
		// Press ENTER on Login button
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
	}
}
