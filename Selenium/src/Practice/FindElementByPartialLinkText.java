package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByPartialLinkText {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://amazon.com/");
	driver.findElement(By.partialLinkText("Skip to "));  //Skip to main content
	System.out.println("Element 1 Identified");
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.partialLinkText("VIEW "));   //VIEW ALL
	System.out.println("Element 2 Identified");
	
	driver.get("https://www.myntra.com/");
	driver.findElement(By.partialLinkText("Home &"));  //Home & Living
	System.out.println("Element 3 Identified");
	
	driver.get("https://www.zomato.com/");
	driver.findElement(By.partialLinkText("Add restau"));    //Add restaurant
	System.out.println("Element 4 Identified");
	
	driver.get("https://www.swiggy.com/");
	driver.findElement(By.partialLinkText("Swigg"));  //Swiggy Blog
	System.out.println("Element 5 Identified");
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.partialLinkText("Forgotten pa"));  //Forgotten password?
	System.out.println("Element 6 Identified");
	
	driver.get("https://www.youtube.com/");
	driver.findElement(By.partialLinkText("Policy "));  //Policy & Safety
	System.out.println("Element 7 Identified");
	
	driver.get("https://in.linkedin.com/");
	driver.findElement(By.partialLinkText("Forgot pa"));  //Forgot password?
	System.out.println("Element 8 Identified");
	
	driver.get("https://www.netflix.com/in/");
	driver.findElement(By.partialLinkText("000-800-9"));  //000-800-919-1694
	System.out.println("Element 9 Identified");
	
	driver.get("https://www.uber.com/in/en/");
	driver.findElement(By.partialLinkText("Request"));  //Request now
	System.out.println("Element 10 Identified");

	driver.close();
}
}