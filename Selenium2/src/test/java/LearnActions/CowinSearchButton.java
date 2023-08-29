package LearnActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CowinSearchButton {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cowin.gov.in");
// Identify the Search Button
		
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 900).perform();
// MoveTargetOutOfBoundException
		WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));
		actions.pause(2000).moveToElement(searchButton).pause(2000).click(searchButton).perform();
	}
}
