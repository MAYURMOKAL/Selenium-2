package LearnActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingAbilityOfClickMethod {
	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com");
		WebElement messenger = driver.findElement(By.linkText("Messenger"));
		Thread.sleep(3000);

// NOTE : Click() Method has Default Scrolling Ability and it is not always TRUE.
//		messenger.click();
		Actions actions = new Actions(driver);
		actions.scrollToElement(messenger).perform();
//		actions.scrollByAmount(0, 200).perform();
	}
}
