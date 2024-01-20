package PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("C:\\Users\\mayur\\Desktop\\SeleniumFile\\PromptPopUp.html");
	
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("12345678");
	driver.switchTo().alert().accept();
}
}
