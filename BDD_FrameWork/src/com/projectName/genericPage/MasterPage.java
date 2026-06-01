package com.projectName.genericPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {

	public static WebDriver driver;

	protected Properties prop1;
	protected Properties prop2;
	protected Properties prop3;

	// Constructor Implementation
	public MasterPage() throws IOException { 

		// config properties file implementation
		FileInputStream fis1 = new FileInputStream("./src/com/projectName/repository/config.properties");
		prop1 = new Properties();
		prop1.load(fis1);

		// locators properties file implementation
		FileInputStream fis2 = new FileInputStream("./src/com/projectName/repository/locator.properties");
		prop2 = new Properties();
		prop2.load(fis2);

		// testdata properties file implementation
		FileInputStream fis3 = new FileInputStream("./src/com/projectName/repository/testdata.properties");
		prop3 = new Properties();
		prop3.load(fis3);

		// Launching Browsers - chrome/firefox/edge
		if (prop1.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
			driver = new ChromeDriver();
		} else if (prop1.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/shubham.jogdand@firstcry.io/Downloads/firefoxdriver");
			driver = new FirefoxDriver();
		} else if (prop1.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "/home/shubham.jogdand@firstcry.io/Downloads/edgedriver");
			driver = new EdgeDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(prop1.getProperty("url"));

	}

	public static void main(String[] args) throws IOException {
		new MasterPage();
	}

}
