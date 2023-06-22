package Practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesPractice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie singleCookie : allCookies) {
			System.out.println(singleCookie.getName());
		}
		
		Cookie cooky1=new Cookie("Selenium","12345");
		Cookie cooky2=new Cookie("Java","12345");
		Cookie cooky3=new Cookie("Manual","12345");
		driver.manage().addCookie(cooky1);
		driver.manage().addCookie(cooky2);
		driver.manage().addCookie(cooky3);

		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie singleCookie : allCookies) {
			System.out.println(singleCookie.getName());
		}
			
			driver.manage().deleteCookieNamed("Manual");
			
			allCookies = driver.manage().getCookies();
			System.out.println(allCookies.size());
			for (Cookie singleCookie : allCookies) {
				System.out.println(singleCookie.getName());
			}
			
			driver.manage().deleteCookie(cooky2);
			
			allCookies = driver.manage().getCookies();
			System.out.println(allCookies.size());
			for (Cookie singleCookie : allCookies) {
				System.out.println(singleCookie.getName());
			}
			
			driver.manage().deleteAllCookies();
			
			allCookies = driver.manage().getCookies();
			System.out.println(allCookies.size());
			for (Cookie singleCookie : allCookies) {
				System.out.println(singleCookie.getName());
				System.out.println(singleCookie.getName());
			}
			
			driver.close();
		}
	}

