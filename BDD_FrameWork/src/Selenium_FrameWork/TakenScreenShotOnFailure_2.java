package Selenium_FrameWork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakenScreenShotOnFailure_2 {

	WebDriver driver;

	public void TakesScreenshot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {

			// Create the reference of TakeScreenshot Interface and TypeCasting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Use getScreenshot() to capture the screenshot in file format
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			// Copy the file to specific location
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyDirectory(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed, screenshot captured.");

		}

	}

	public void captureScreenshot(ITestResult result2) {
		// TODO Auto-generated method stub
		
	}

}
