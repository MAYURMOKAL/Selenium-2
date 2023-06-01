package Practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesScenario3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		
		Set<Cookie> allcookies = driver.manage().getCookies();
		System.out.println(allcookies.size());
		for (Cookie singlecookie : allcookies) {
			System.out.println(singlecookie.getName());
		}
		
		Cookie cooky = new Cookie("Selenium","12345");
		driver.manage().addCookie(cooky);
		
		allcookies = driver.manage().getCookies();
		System.out.println(allcookies.size());
		for (Cookie singlecookie : allcookies) {
			System.out.println(singlecookie.getName());
		}
		driver.manage().deleteCookieNamed("Selenium");
		allcookies = driver.manage().getCookies();
		System.out.println(allcookies.size());
		for (Cookie singlecookie : allcookies) {
			System.out.println(singlecookie.getName());
		}
}
}