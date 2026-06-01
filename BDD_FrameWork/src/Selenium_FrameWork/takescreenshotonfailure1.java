package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class takescreenshotonfailure1 {

	TakeScreenshotOnFailure1 ts1 = new TakeScreenshotOnFailure1();

	@Test
	public void captureScreenshot() {
		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		ts1.driver = new ChromeDriver();

		// Open the url
		ts1.driver.get("https://www.facebook.com");

		// Implicit wait
		ts1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// maximize the chrome
		ts1.driver.manage().window().maximize();

		ts1.driver.findElement(By.id("wrong_id")).click();

	}
}
