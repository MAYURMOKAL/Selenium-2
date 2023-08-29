package PopUp;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownloadPopUp {
	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement download = driver.findElement(By.linkText("4.11.0"));
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 700).pause(2000).click(download).perform();
		driver.get("chrome://downloads/");
		Thread.sleep(2000);
// Identify the Shadow Host Element
		WebElement shadowHost1 = driver.findElement(By.tagName("downloads-manager"));
// Identify the Shadow Root Element inside Shadow Host Element
		SearchContext shadowRoot1 = shadowHost1.getShadowRoot();
		WebElement shadowHost2 = shadowRoot1.findElement(By.cssSelector("downloads-item[id='frb0']"));
		SearchContext shadowRoot2 = shadowHost2.getShadowRoot();
		WebElement interactiveElement = shadowRoot2.findElement(By.cssSelector("cr-button[focus-type='save']"));
		Thread.sleep(2000);
		interactiveElement.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
