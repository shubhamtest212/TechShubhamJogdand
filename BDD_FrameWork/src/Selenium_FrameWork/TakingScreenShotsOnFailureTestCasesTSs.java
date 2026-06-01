package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenShotsOnFailureTestCasesTSs {

	TakingScreenShotsOnFailureTestCasesTS ts1 = new TakingScreenShotsOnFailureTestCasesTS();

	@Test
	public void doLogin() {

		// set the property of chromebrowser
		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		ts1.driver = new ChromeDriver();

		// Implict wait
		ts1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Open the url
		ts1.driver.get("https://www.facebook.com");
		ts1.driver.findElement(By.id("wrong_id")).click();

	}

}
