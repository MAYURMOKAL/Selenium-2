package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_To {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");  // to(String string)
		
		URL url = new URL("https://www.gmail.com/");
		driver.navigate().to(url);  //  to(URL string)
	}
}
