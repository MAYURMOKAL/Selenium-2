package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=atv_hm_pri_c_9zZ8D2_1_0");
		driver.findElement(By.name("description"));
		System.out.println("Element 1 Identified");
		
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.name("LanguageSelect"));
		System.out.println("Element 2 Identified");
		
		driver.get("https://twitter.com/i/flow/login");
		driver.findElement(By.name("facebook-domain-verification"));
		System.out.println("Element 3 Identified");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("robots"));
		System.out.println("Element 4 Identified");
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.name("dropdown-selection"));
		System.out.println("Element 5 Identified");
		
		driver.get("https://www.meesho.com/");
		driver.findElement(By.name("Analog Watches"));
		System.out.println("Element 6 Identified");
		
		driver.get("https://www.myntra.com/");
		driver.findElement(By.name("twitter:title"));
		System.out.println("Element 7 Identified");
		
		driver.get("https://www.zomato.com/mumbai");
		driver.findElement(By.name("About Zomato"));
		System.out.println("Element 8 Identified");
		
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.name("og_title"));
		System.out.println("Element 9 Identified");
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("mobile-web-app-capable"));
		System.out.println("Element 10 Identified");
		
		driver.close();
}
}