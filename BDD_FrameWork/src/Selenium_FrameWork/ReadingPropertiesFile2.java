package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFile2 {

	public static void main(String[] args) throws Exception {

		// Reading config properties from config.properties
		File src1 = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/config.properties");
		FileInputStream fis1 = new FileInputStream(src1);
		Properties pro1 = new Properties();
		pro1.load(fis1);

		// Reading locator properties from locator.properties
		File scr2 = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/locator.properties");
		FileInputStream fis2 = new FileInputStream(scr2);
		Properties pro2 = new Properties();
		pro2.load(fis2);

		// Reading testdata properties from testdata.properties
		File src3 = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/testdata.properties");
		FileInputStream fis3 = new FileInputStream(src3);
		Properties pro3 = new Properties();
		pro3.load(fis3);

		// Reading webdriver property and webdriver path property from config.properties
		// file
		System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Reading URL from config.properties
		driver.get(pro1.getProperty("URL_1"));
		driver.get(pro1.getProperty("URL_2"));
	}

}
