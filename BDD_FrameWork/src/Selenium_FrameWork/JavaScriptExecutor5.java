package Selenium_FrameWork;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor5 {

	public static void main(String[] args) throws Exception {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.facebook.com");

		// Maximize the screen
		driver.manage().window().maximize();

		// JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='shubham'");
		jse.executeScript("document.getElementsByName('pass')[0].value='SHUBHAM'");
		jse.executeScript("document.getElementsByName('login')[0].click()");

		// scroll up by using JS
		jse.executeScript("window.scrollBy(0,500)");

		// scroll down by using JS
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-500)");
	}
}
