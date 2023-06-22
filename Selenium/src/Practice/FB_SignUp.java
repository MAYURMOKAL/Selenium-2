package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_SignUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.xpath("//a[contains(@class,'42ft')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Mayur");
		driver.findElement(By.name("lastname")).sendKeys("Mokal");
		driver.findElement(By.name("reg_email__")).sendKeys("mayurmokal@gmail.com");
//		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mayurmokal@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("mayur123");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	}
}
