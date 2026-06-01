package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repor2 {

	public static void main(String[] args) throws Exception {

		// Read Properties from Repository
		File src = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/config.properties");

		FileInputStream FIS1 = new FileInputStream(src);
		Properties pro1 = new Properties();
		pro1.load(FIS1);

		// Read webdriver path from external repository
		System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();

		// Read url from repository files
		driver.get(pro1.getProperty("URL_2"));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.get(pro1.getProperty("URL_1"));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
