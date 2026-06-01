package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TakenScreenShotOnFailure_3 {

	TakenScreenShotOnFailure_2 ts1 = new TakenScreenShotOnFailure_2();

	@Test
	public void doLogin() {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		ts1.driver = new ChromeDriver();
		ts1.driver.manage().window().maximize();
		ts1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ts1.driver.get("https://www.facebook.com");
		ts1.driver.findElement(By.id("wrong_id")).click();

	}

	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		ts1.captureScreenshot(result2);

	}

}
