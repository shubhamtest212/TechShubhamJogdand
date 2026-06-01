package Practices_Codes;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_3 {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("Java_3");
		PropertyConfigurator.configure(
				"/home/shubham.jogdand@firstcry.io/git/SDET_Engineer_Shubham_Jogdand/BDD_FrameWork/Repository2/LOG4J.properties");
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		logger.info("System");
		WebDriver driver = new ChromeDriver();
		logger.info("System path");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		logger.info("URL Launched");

	}

}
