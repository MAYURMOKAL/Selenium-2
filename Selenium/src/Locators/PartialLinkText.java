package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com/");
		driver.findElement(By.partialLinkText("Customer"));  //full link text : "Customer Service"
		System.out.println("Element Identified");
		driver.close();
	}
}
