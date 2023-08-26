package OptimizeSearchCriteria;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWithFrom {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com");
// Identify the <Form> Tag
	WebElement parentElement = driver.findElement(By.tagName("form"));
	WebElement emailTextfield = parentElement.findElement(By.id("email"));
	emailTextfield.sendKeys("Selenium");
	WebElement passTextfield = parentElement.findElement(By.id("pass"));
	passTextfield.sendKeys("1234567");
	WebElement loginButton = parentElement.findElement(By.name("login"));
	loginButton.click();
	
	
}
}
