package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesScenario2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");

		Set<Cookie> allcookies = driver.manage().getCookies();
		System.out.println(allcookies.size());
		for (Cookie singlecookie : allcookies) {
			System.out.println(singlecookie.getName());
		}

		driver.manage().deleteCookieNamed("fr");
		
		allcookies = driver.manage().getCookies();
		System.out.println(allcookies.size());
		for (Cookie singlecookie : allcookies) 
			System.out.println(singlecookie.getName());
		
		driver.close();
	}
}
