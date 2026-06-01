package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repor3 {

	public static void main(String[] args) throws Exception {

		// Reading test data from repository files
		File src3 = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/URL.properties");

		FileInputStream FIS3 = new FileInputStream(src3);
		Properties PROP3 = new Properties();
		PROP3.load(FIS3);

		System.setProperty(PROP3.getProperty("driverProperty"), PROP3.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.get(PROP3.getProperty("URL"));

	}

}
