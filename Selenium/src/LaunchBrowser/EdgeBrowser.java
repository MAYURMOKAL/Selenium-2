package LaunchBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
	}
}
