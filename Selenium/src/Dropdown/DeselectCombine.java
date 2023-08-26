package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectCombine {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("C:\\Users\\mayur\\Desktop\\Dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select select = new Select(city);

		Thread.sleep(2000);
		select.selectByIndex(0);
			Thread.sleep(2000);
			select.selectByValue("2");
		Thread.sleep(2000);
		select.selectByVisibleText("Tokyo");
		
		Thread.sleep(2000);
		select.deselectByIndex(0);
			Thread.sleep(2000);
			select.deselectByValue("2");
		Thread.sleep(2000);
		select.deselectByVisibleText("Tokyo");
		
	}
}
