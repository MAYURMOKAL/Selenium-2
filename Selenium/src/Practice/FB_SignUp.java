package Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_SignUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Mayur");
		driver.findElement(By.name("lastname")).sendKeys("Mokal");
		driver.findElement(By.name("reg_email__")).sendKeys("mayurmokal@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mayurmokal@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("mayur123");
		driver.findElement(By.xpath("//input[@value='2']")).click();
	}		
}
