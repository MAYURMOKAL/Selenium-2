package LearnActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InterceptedException {
	public static void main(String[] args) throws Throwable{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Registry']/preceding-sibling::a[text()='Customer Service']"));
		Thread.sleep(3000);
		ele.click();
	}
}
