package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement password = driver.findElement(By.id("pass"));
		password.click();
		password.sendKeys("Hello");
		Thread.sleep(3000);
		password.clear();
		Thread.sleep(3000);
		password.sendKeys("Hii");

}
}