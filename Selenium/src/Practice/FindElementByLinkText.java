package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.linkText("Gift Cards"));
		System.out.println("Element 1 Identified");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.linkText("Appliances"));
		System.out.println("Element 2 Identified");
		
		driver.get("https://www.myntra.com/");
		driver.findElement(By.linkText("T-Shirts"));
		System.out.println("Element 3 Identified");
		
		driver.get("https://www.zomato.com/");
		driver.findElement(By.linkText("Add restaurant"));
		System.out.println("Element 4 Identified");
		
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.linkText("Sign up"));
		System.out.println("Element 5 Identified");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?"));
		System.out.println("Element 6 Identified");
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.linkText("Copyright"));
		System.out.println("Element 7 Identified");
		
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.linkText("Forgot password?"));
		System.out.println("Element 8 Identified");
		
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.linkText("Account"));
		System.out.println("Element 9 Identified");
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register"));
		System.out.println("Element 10 Identified");
		
		driver.close();
	}
}
