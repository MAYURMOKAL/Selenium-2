package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionCheck {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement submitButton = driver.findElement(By.name("submit"));
// HARD ASSERT
//		Assert.assertTrue(submitButton.isEnabled(), "The Submit Button is in Disable State.");
		
// Soft Assert
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(submitButton.isEnabled(), "The Submit Button is in Disable State.");
		
		driver.manage().window().minimize();
		driver.quit();
// Mandatory when using Soft Assert
		softAssert.assertAll();
	}
}
