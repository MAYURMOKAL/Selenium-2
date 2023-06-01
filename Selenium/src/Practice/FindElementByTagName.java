package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByTagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.tagName("a"));
		System.out.println("Element 1 Identified");
		
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.tagName("span"));
		System.out.println("Element 2 Identified");
		
		driver.get("https://in.pinterest.com/");
		driver.findElement(By.tagName("div"));
		System.out.println("Element 3 Identified");
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.tagName("img"));
		System.out.println("Element 4 Identified");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.tagName("button"));
		System.out.println("Element 5 Identified");
		
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
		driver.findElements(By.tagName("li"));
		System.out.println("Element 6 Identified");
		
		driver.get("https://www.meesho.com/");
		driver.findElements(By.tagName("img"));
		System.out.println("Element 7 Identified");
		
		driver.get("https://www.netflix.com/in/");
		driver.findElements(By.tagName("select"));
		System.out.println("Element 8 Identified");
		
		driver.get("https://twitter.com/i/flow/login");
		driver.findElements(By.tagName("div"));
		System.out.println("Element 9 Identified");
		
		driver.get("https://www.myntra.com/");
		driver.findElements(By.tagName("iframe"));
		System.out.println("Element 10 Identified");
		
		driver.close();
}
}
