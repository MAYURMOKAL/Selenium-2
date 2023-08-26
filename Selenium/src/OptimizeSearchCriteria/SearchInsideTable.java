package OptimizeSearchCriteria;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInsideTable {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://irctc.com/contact.html");
	WebElement irctcTable = driver.findElement(By.tagName("table"));
	WebElement tableBody = driver.findElement(By.tagName("tbody"));
	List<WebElement> allRowsInTableBody = tableBody.findElements(By.tagName("tr"));
	
	for (WebElement tableRow : allRowsInTableBody) {
		
		try {
			String url = tableRow.findElement(By.tagName("a")).getAttribute("href");
			System.out.println(url);
		} catch (Exception e) {
			
		}
	}
	driver.quit();
}
}
