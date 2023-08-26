package JavascriptExecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import TypeCasting.TakesScreenshotUpcast;

public class JSDemo {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement loginButton = driver.findElement(By.name("login"));
// Flashing
//		JavaScriptUtil.flash(loginButton, driver);
		
// Drawing Border & Screenshot
		JavaScriptUtil.drawBorder(loginButton, driver);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/border.png");
		FileHandler.copy(source, destination);
	}
}
