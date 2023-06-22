package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.jmx.ManagedAttribute;

import Locators.LinkText;

public class WebElementMethodsClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		WebElement gmaillink = driver.findElement(By.linkText("Gmail"));
		gmaillink.click();
		
		driver.get("https://www.amazon.com");
		WebElement search = driver.findElement(By.linkText("twotabsearchtextbox"));
		search.click();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.click();
		
		driver.get("https://www.fb.com");
		WebElement password1 = driver.findElement(By.id("passContainer"));
		password1.click();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement link = driver.findElement(By.partialLinkText("Computers"));
		link.click();
		
		driver.get("https://www.youtube.com/");
		WebElement gaming = driver.findElement(By.linkText("Gaming"));
		gaming.click();
		
		driver.get("https://www.google.co.in/");
		WebElement hindi = driver.findElement(By.linkText("हिन्दी"));
		hindi.click();
		
		driver.get("https://github.com/");
		WebElement signin = driver.findElement(By.xpath("//input[@placeholder='Search GitHub']"));
		signin.click();
		
		driver.get("https://open.spotify.com/");
		WebElement signup = driver.findElement(By.xpath("//span[text()='Log in']"));
		signup.click();
		
		driver.get("https://www.flipkart.com/mobile-phones-bsd-june-aj83n-nou87-store?fm=neo%2Fmerchandising&iid=M_6bf0549b-16d4-47bc-8bed-ef7613ba7f0c_1_6LEPZLPGAN32_MC.BYIXDBQAWBHQ&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles%2B%2526%2BTablets_BYIXDBQAWBHQ&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=BYIXDBQAWBHQ");
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		
		driver.close();
	}
}
