package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// This programme is written for JavaScriptExecutor and Scroll up and Scroll down
public class JavaScriptExecutor1 {

	public static void main(String[] args) throws Exception {
		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.facebook.com");

		// Implict wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Maximize the screen
		driver.manage().window().maximize();

		// Delete all cookies
		driver.manage().deleteAllCookies();

		// JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Locate element by using JavascriptExecutor
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementsByName('pass')[0].value='Test@123'");
		jse.executeScript("document.getElementsByName('login')[0].click()");

		// Scroll down by using JavascriptExecutor
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,500)");

		// Scroll up by using JavascriptExecutor
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");

	}

}
