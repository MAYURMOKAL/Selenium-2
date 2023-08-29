package LearnActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("C:/Users/mayur/Desktop/doubleclickbutton.html");
		WebElement dblClkButton = driver.findElement(By.id("doubleclick"));
		Actions actions = new Actions(driver);
		actions.doubleClick(dblClkButton).perform();
	}
}
