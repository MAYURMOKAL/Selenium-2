package LaunchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
}
}
