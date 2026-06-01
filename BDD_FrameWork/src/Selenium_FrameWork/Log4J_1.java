package Selenium_FrameWork;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4J_1 {

	public static void main(String[] args) {

		// create logger instance
		Logger logger = Logger.getLogger("Log4J_1");

		// configure log4j properties file
		PropertyConfigurator.configure(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository2/LOG4J.properties");

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// ChromeDriver Instance
		WebDriver driver = new ChromeDriver();

		// Logger
		logger.info("WebDriver Instance");

		driver.get("https://www.facebook.com");

		// Logger
		logger.info("Application Open");

	}

}
