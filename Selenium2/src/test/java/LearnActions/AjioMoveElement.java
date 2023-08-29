package LearnActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjioMoveElement {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.ajio.com/shop/men");
// Identify Wishlist/Favourite Icon
	WebElement menSection = driver.findElement(By.xpath("//a[@title='MEN']/parent::li"));
	Actions actions = new Actions(driver);
// Move from MEN section to Other Sections	
	actions.moveToElement(menSection).pause(4000).moveToElement(menSection, 78, 0).
	pause(4000).moveToElement(menSection, 157, 0).
	pause(4000).moveToElement(menSection, 227, 0).
	pause(4000).moveToElement(menSection, 354, 0).build().perform();
	}
}
