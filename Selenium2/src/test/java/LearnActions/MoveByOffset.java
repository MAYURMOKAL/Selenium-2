package LearnActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ajio.com/shop/men");
// Identify Wishlist/Favourite Icon
		WebElement wishlist = driver.findElement(By.xpath("//div/img[@alt='wishlistIcon']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(wishlist).pause(2000).moveToElement(wishlist, 54, 0).build().perform();
	}
}
