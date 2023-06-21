package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.youtube.com/");
	driver.findElement(By.name("search_query")).sendKeys("tom and jerry");
//	Thread.sleep(3000);
	driver.findElement(By.id("search-icon-legacy")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//img[contains(@src,'uph5A')]")).click();
}
}
