package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {

	TakeScreenShotOnFailure1 t1 = new TakeScreenShotOnFailure1();

	@Test
	public void doLogin() {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		t1.driver = new ChromeDriver();

		// Open the url
		t1.driver.get("https://www.facebook.com");

		// Implicit wait
		t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// maximize the chrome
		t1.driver.manage().window().maximize();

		t1.driver.findElement(By.id("wrong_id")).click();
	}

	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		t1.captureScreenshot(result2);
	}
}
