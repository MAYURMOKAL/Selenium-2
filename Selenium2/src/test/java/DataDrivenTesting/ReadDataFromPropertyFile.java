package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadDataFromPropertyFile {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
// Create an Fileinputstream Object
		FileInputStream fis = new FileInputStream("./src/test/resources/actitimedata.properties");
// Create an Properties Object
		Properties pobj = new Properties();
		pobj.load(fis);
		
		pobj.getProperty("browser");
		pobj.getProperty("url");
		pobj.getProperty("username");
		pobj.getProperty("password");
		
		String browserName = pobj.getProperty("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equals("edge")) {
			driver = new EdgeDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(pobj.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();
		
		
	}
}
