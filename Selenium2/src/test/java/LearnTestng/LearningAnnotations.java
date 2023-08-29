package LearnTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearningAnnotations {
	WebDriver driver;
 @BeforeMethod
	public void login() throws Throwable{
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextfield = driver.findElement(By.id("username"));
		usernameTextfield.sendKeys("admin");
		WebElement passwordTexrfield = driver.findElement(By.name("pwd"));
		passwordTexrfield.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(3000);
	}
	@Test
	public void searchTask() throws Throwable{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchTaskTextfield = driver.findElement(By.id("taskSearchControl_field"));
		searchTaskTextfield.sendKeys("selenium");
		Thread.sleep(3000);
	}
	
	@Test
	public void calls() throws Throwable{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement callsTask = driver.findElement(By.xpath("//div[@class='task' and text()='Calls']"));
		callsTask.click();
		Thread.sleep(3000);
		WebElement closePanel = driver.findElement(By.className("hideButton_panelContainer"));
		closePanel.click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void logout() throws Throwable{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		logoutLink.click();
		driver.manage().window().minimize();
		driver.quit();
	}
}
