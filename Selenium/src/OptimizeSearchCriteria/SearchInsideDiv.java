package OptimizeSearchCriteria;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInsideDiv {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://www.myntra.com");
		 WebElement parentDivTag = driver.findElement(By.className("desktop-navLinks"));
		 List<WebElement> allMenuOptions = parentDivTag.findElements(By.className("desktop-main"));
		 for (WebElement menuOption : allMenuOptions) {
			System.out.println(menuOption.getText());
		}
		 driver.quit();
	}
}
