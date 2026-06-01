package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLoggin {

	public static void main(String[] args) throws Exception {

		// create logger instance
		Logger logger = Logger.getLogger("Log4JLoggin");

		// configure log4j.properties file
		PropertyConfigurator.configure(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/Log44J.properties");

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Logger object
		logger.info("Open browser Instance");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("implicit wait given");

		// Maximize the screen
		driver.manage().window().maximize();
		logger.info("window maximized");

		// Open the url
		driver.get("https://www.facebook.com");
		logger.info("Open facebook app");

		try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("web element found");
		} catch (Exception e) {
			logger.info("web element not found");
		}

	}

}
