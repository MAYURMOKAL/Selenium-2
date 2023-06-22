package Practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesScenario1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		System.out.println(driver.manage().getCookies());
		
		Cookie Cooky = new Cookie("Cookie", "1234");
		driver.manage().addCookie(Cooky);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		System.out.println(driver.manage().getCookies());
		
		driver.manage().deleteCookie(Cooky);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		System.out.println(driver.manage().getCookies());
		
		driver.close();
	}
}
