package RegiesterApp;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) throws InterruptedException {
Random random=new Random();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(30);
		
		WebElement first = driver.findElement(By.id("FirstName"));
		first.sendKeys("kajal");
		WebElement last = driver.findElement(By.id("LastName"));
		last.sendKeys("shirke");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("kajals"+random+"@gmail.com");
		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys(random+"1234567");
		WebElement con = driver.findElement(By.id("ConfirmPassword"));
		con.sendKeys(random+"1234567");
		 driver.findElement(By.id("register-button")).click();
		 
		 driver.findElement(By.xpath("//a[text()='Log in']")).click();
		 Thread.sleep(30);
		 email=driver.findElement(By.id("Email"));
		 email.sendKeys("kajals9491@gmail.com");
		 pass=driver.findElement(By.id("Password"));
			pass.sendKeys("1234567");
			driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
			driver.close();
		 
		
		
		
		
		
		
		
		
		
		

	}

}
