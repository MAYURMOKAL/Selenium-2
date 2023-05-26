package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign23_1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		
		
		if (actualTitle.equals(expectedTitle)) 
			System.out.println("Title is Matched");
		
		else
			System.out.println("Title is NOT Matched");
	
		
		if (actualURL.equals(expectedURL))
			System.out.println("URL is Matched");
		else 
			System.out.println("URL is NOT Matched");
		driver.close();
	}
}
