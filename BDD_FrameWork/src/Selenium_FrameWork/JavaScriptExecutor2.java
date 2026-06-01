package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor2 {

	public static void main(String[] args) throws Exception {
		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Implict wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Open the url
		driver.get("https://www.facebook.com");

		// Maximize the screen
		driver.manage().window().maximize();

		// Delete all cookies
		driver.manage().deleteAllCookies();

		// Click on Create new Account
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();

		// Locate web element by using JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementsByName('firstname')[0].value='Shubham'");
		jse.executeScript("document.getElementsByName('lastname')[0].value='Jogdand'");

		// Scroll Up & Scroll Down
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-500)");

	}

}
