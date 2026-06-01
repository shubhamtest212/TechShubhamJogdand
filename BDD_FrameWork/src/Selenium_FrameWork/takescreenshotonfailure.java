package Selenium_FrameWork;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class takescreenshotonfailure {

	WebDriver driver;

	public void captureScreenshot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed, screenshot captured.");

		}

	}

}
