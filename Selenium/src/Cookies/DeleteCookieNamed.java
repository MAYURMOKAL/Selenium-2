package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookieNamed {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		
		Cookie cooky= new Cookie("Selenium", "1111");
		driver.manage().addCookie(cooky);
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie singleCookie : allCookies) {
			System.out.println(singleCookie.getName());
		}
		
		driver.manage().deleteCookieNamed("Selenium");
		
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie singleCookie : allCookies) {
			System.out.println(singleCookie.getName());
		}
	}
}
