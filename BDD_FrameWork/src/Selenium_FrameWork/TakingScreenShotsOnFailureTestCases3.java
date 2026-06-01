package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TakingScreenShotsOnFailureTestCases3 {

	TakingScreenShotsOnFailureTestCases2 t1 = new TakingScreenShotsOnFailureTestCases2();

	@Test
	public void doLogin() {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		t1.driver = new ChromeDriver();

		// Implict wait
		t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Open the url
		t1.driver.get("https://www.facebook.com");
		t1.driver.findElement(By.id("wrong_id")).click();

	}

	@AfterMethod
	public void takeScreenshot(ITestResult result2) {
		t1.captureScreenShot(result2);

	}

}
