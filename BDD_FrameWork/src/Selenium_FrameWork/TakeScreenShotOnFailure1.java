package Selenium_FrameWork;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenShotOnFailure1 {

	WebDriver driver;

	// ItestResult will provide the test case execution status and test name

	public void captureScreenshot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {

			// create reference of TakesScreenshot Inteface and TypeCasting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Use getScreenshotAs() to capture the screenshot in File format
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			// Copy the file to the specific location
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed,screenshot captured.");
		}
	}

}
