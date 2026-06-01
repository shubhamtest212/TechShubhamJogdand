package Selenium_FrameWork;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logger_report {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("logger_report");
		PropertyConfigurator.configure(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository2/LOG4J.properties");

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		logger.info("System Set Proverty");

		WebDriver driver = new ChromeDriver();
		logger.info("Driver");

		driver.get("https://www.facebook.com");
		logger.info("FACEBOOK");

	}

}
