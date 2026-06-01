package Selenium_FrameWork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakenScreenShotOnFailure1 {

	WebDriver driver;

	// ITestResult will provide the test case execution status and test name
	public void captureScreenShot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {

			// created reference of takesscreenshot interface and tycasting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// use getscreenshotas() to capture the screenshot in file format
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			// copy the file to specific location
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed, screenshot caputred.");

		}

	}

}
