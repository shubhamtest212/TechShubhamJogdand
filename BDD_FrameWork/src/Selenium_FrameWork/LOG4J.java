package Selenium_FrameWork;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOG4J {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("LOG4J");
		PropertyConfigurator.configure(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository2/LOG4J.properties");
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		logger.info("WEBDRIVER INSTANCE OPEN");
		driver.get("https://stage.rocketbees.in/rb_b2c_cms/login");
		logger.info("URLLL");

	}

}
