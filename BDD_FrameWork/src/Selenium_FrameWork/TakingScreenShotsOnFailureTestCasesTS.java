package Selenium_FrameWork;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakingScreenShotsOnFailureTestCasesTS {

	WebDriver driver;

	public void captureScreenshot(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			File destFolder = new File("./screenshots/" + result.getName() + ".png");

			System.out.println(result.getName() + "method() failed, screenshot captured.");

		}

	}

}
