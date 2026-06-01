package Selenium_FrameWork;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakenScreenShotOnFailure_1 {

	WebDriver driver;

	public void captureScreenshot(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {

			// Create reference of TakesScreenShot Interface and TypeCasting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Use getScreenShotAs() to capture the screenshot in file format
			File SourceFile = ts.getScreenshotAs(OutputType.FILE);

			// Copy the file to specific location
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			System.out.println(result.getName() + "method() failed, screenshot captured.");
		}

	}
}
