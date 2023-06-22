package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(3000);
			WebElement username = driver.findElement(By.name("username"));
			if(username.isEnabled()) {
				username.sendKeys("Admin");
			}else {
				System.out.println("Username not Enabled");
			}
			WebElement password = driver.findElement(By.name("password"));
			if(password.isEnabled()) {
				password.sendKeys("admin123");
			}else {
				System.out.println("Password not Enabled");
			}
			WebElement button = driver.findElement(By.xpath("//button[contains(@class,'button')]"));
			if(button.isEnabled()) {
				button.click();
			}
			else {
				System.out.println("Button not Enabled");
			}
			Thread.sleep(3000);
			String currentUrl = driver.getCurrentUrl();
			String actualUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			if(currentUrl.equals(actualUrl)) {
				System.out.println("Homepage is displayed");
			}else {
				System.out.println("Homepage not displayed");
			}
			driver.close();
		}
}
