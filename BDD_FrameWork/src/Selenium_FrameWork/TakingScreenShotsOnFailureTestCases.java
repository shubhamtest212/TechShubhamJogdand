package Selenium_FrameWork;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

// Taking screenshots on failure test cases

public class TakingScreenShotsOnFailureTestCases {

	WebDriver driver;

	// ITestResult will provide the test case execution status and test name
	public void captureScreenshot(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {

			// create reference of Takesscreenshot Interface and TypeCasting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Use getscreenshot() to capture the screenshot in file format
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			// copy the file to specific location
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			System.out.println(result.getName() + "method() failed, screenshot captured.");
		}

	}
}
