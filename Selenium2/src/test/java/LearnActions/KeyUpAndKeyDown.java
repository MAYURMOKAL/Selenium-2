package LearnActions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com");
//		driver.switchTo().activeElement();
		Actions actions = new Actions(driver);
		actions.keyDown(driver.switchTo().activeElement(), Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("e").
		keyDown(Keys.SHIFT).sendKeys("l").keyUp(Keys.SHIFT).sendKeys("e").
		keyDown(Keys.SHIFT).sendKeys("n").keyUp(Keys.SHIFT).sendKeys("i").
		keyDown(Keys.SHIFT).sendKeys("u").keyUp(Keys.SHIFT).sendKeys("m").
		keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL).
		keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	}
}
