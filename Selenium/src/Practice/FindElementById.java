package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=atv_hm_pri_c_9zZ8D2_1_0");
		driver.findElement(By.id("a-page"));
		System.out.println("Element 1 Identified");
		
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.id("button--nmhp-card-faq-accordion--1"));
		System.out.println("Element 2 Identified");
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("chips"));
		System.out.println("Element 3 Identified");
		
		driver.get("https://www.fb.com/");
		driver.findElement(By.id("passContainer"));
		System.out.println("Element 4 Identified");
		
		driver.get("https://www.zomato.com/mumbai");
		driver.findElement(By.id("root"));
		System.out.println("Element 5 Identified");
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.id("viewport"));
		System.out.println("Element 6 Identified");
		
		driver.get("https://www.swiggy.com");
		driver.findElement(By.id("location"));
		System.out.println("Element 7 Identified");
		
		driver.get("https://www.meesho.com/");
		driver.findElement(By.id("_goober"));
		System.out.println("Element 8 Identified");
		
		driver.get("https://www.myntra.com/");
		driver.findElement(By.id("boomr-scr-as"));
		System.out.println("Element 9 Identified");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.id("container"));
		System.out.println("Element 10 Identified");
		
		driver.close();
	}
}
