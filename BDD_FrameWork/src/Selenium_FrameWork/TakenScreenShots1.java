package Selenium_FrameWork;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakenScreenShots1 {

	WebDriver driver;

	// ITestResult will provide the test case execution status and test name
	public void captureScreenshot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {

			// Create reference of TakesScreenShot Interface and TypeCasting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// use getScreenShotAs() to capture the screenshot in file format
			File SourceFile = ts.getScreenshotAs(OutputType.FILE);

			// copy the file to specific location
			File destFolder = new File("./screenshot/" + result.getName() + ".png");
			FileUtils.copyDirectory(SourceFile, destFolder);
			System.out.println(result.getName() + "method() failed, screenshot captured");

		}

	}
}
