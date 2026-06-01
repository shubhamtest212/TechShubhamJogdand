package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws Exception {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Open the url
		driver.get("https://demoqa.com/");

		// Maximize the screen
		driver.manage().window().maximize();

		// Accept Alert by using JavascriptExecutor
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('confirmButton').click()");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");

	}

}