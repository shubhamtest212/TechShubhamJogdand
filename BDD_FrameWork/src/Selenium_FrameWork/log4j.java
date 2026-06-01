package Selenium_FrameWork;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j {

	public static void main(String[] args) {

		// Logger
		Logger logger1 = Logger.getLogger("log4j");
		PropertyConfigurator.configure(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository2/LOG4J.properties");

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		logger1.info("APPLICATION LAUNCHED");

		driver.findElement(By.name("email")).sendKeys("test1");

	}

}
