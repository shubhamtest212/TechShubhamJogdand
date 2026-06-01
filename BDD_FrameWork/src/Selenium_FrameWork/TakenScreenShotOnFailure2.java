package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TakenScreenShotOnFailure2 {

	TakenScreenShotOnFailure1 ts1 = new TakenScreenShotOnFailure1();

	@Test
	public void doLogin() {
		// set the property of chrome browser
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		ts1.driver = new ChromeDriver();
		ts1.driver.manage().window().maximize();
		ts1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ts1.driver.get("https://www.facebook.com");
		ts1.driver.findElement(By.id("wrong_id")).clear();

	}

	@AfterMethod
	public void TakesScreenShot(ITestResult resul2) throws Exception {
		ts1.captureScreenShot(resul2);

	}

}
