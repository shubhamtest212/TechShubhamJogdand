package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apache_Log4J {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("Apache_Log4J");
		PropertyConfigurator.configure(
				"/home/shubham.jogdand@firstcry.io/git/SDET_Engineer_Shubham_Jogdand/BDD_FrameWork/Repository2/LOG4J.properties");
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		logger.info("PATH SET_UP");
		WebDriver driver = new ChromeDriver();
		logger.info("WEBDRIVER INSTANCE");
		driver.manage().window().maximize();
		logger.info("MAXIMIZE THE SCREEN");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("MANAGED DRIVER");
		driver.get("https://www.facebook.com");
		logger.info("URL Launched");

	}

}
