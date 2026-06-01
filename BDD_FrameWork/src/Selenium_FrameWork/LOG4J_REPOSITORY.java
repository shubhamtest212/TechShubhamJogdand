package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOG4J_REPOSITORY {

	public static void main(String[] args) throws Exception {

		Logger logger = Logger.getLogger("LOG4J_REPOSITORY");
		PropertyConfigurator.configure(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/Log44J.properties");

		File src = new File("/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/test1.properties");

		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);

		System.setProperty(pro.getProperty("driverProperty"), pro.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		logger.info("ChromDriver Instance");

		driver.get(pro.getProperty("URL"));
		logger.info("ULR Launched");
		System.out.println(driver.getTitle());

	}
}
