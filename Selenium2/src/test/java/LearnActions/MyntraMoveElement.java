package LearnActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMoveElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement menSection = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(menSection).pause(2000).moveToElement(menSection, 72, 0).
		pause(2000).moveToElement(menSection, 146, 0).
		pause(2000).moveToElement(menSection, 254, 0).
		pause(2000).moveToElement(menSection, 341, 0).
		pause(2000).moveToElement(menSection, 434, 0).
		build().perform();
	}
}
