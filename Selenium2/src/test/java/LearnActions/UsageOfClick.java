package LearnActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfClick {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com");
	WebElement linkText = driver.findElement(By.linkText("Forgotten password?"));
	
// Create Actions Class Object
	Actions actions = new Actions(driver);
	
	actions.click(linkText).perform();
//	actions.moveToElement(linkText).click().perform();
	
}
}
