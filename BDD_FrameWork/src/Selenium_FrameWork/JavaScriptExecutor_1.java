package Selenium_FrameWork;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_1 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.facebook.com");

		// Maximize the screen
		driver.manage().window().maximize();

		// Delete cookies
		driver.manage().deleteAllCookies();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementsByName('pass')[0].value='SHUBHA'");
		jse.executeScript("document.getElementsByName('login')[0].click()");

	}

}
