package LearnActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfContextClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement login = driver.findElement(By.name("login"));
		Actions actions = new Actions(driver);

// Right Click on Reference ( 0 , 0)
//		actions.contextClick().perform();
// Right Click on WebElement
		actions.contextClick(login).perform();
	
	}
}
