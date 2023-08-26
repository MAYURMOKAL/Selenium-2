package FindElements;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEach {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> allRadioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(allRadioButtons.size());
		for (WebElement singleRadioButton : allRadioButtons) {
			singleRadioButton.click();
			Thread.sleep(1000);
		}
		
	}
}
