package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("C:\\Users\\mayur\\Desktop\\table.html");
		String wid = driver.getWindowHandle();
		System.out.println(wid);
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("C:\\Users\\mayur\\Desktop\\Dropdowns.html");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("city")).getText());
		driver.switchTo().window(wid);
		System.out.println(driver.findElement(By.id("tr1")).getText());
	}
}
