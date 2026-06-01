package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reading_properties {

	public static void main(String[] args) throws Exception {

		File src = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/test1.properties");
		FileInputStream fiss = new FileInputStream(src);
		Properties pro1 = new Properties();
		pro1.load(fiss);

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Implict wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Open the url
		driver.get("https://demoqa.com/browser-windows");

		// Maximize the screen
		driver.manage().window().maximize();

		driver.get(pro1.getProperty("URL"));
	}

}
