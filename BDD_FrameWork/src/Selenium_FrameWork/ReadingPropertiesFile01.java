package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFile01 {

	public static void main(String[] args) throws Exception {

		// Reading set path and driver path properties from URL. Properties

		File src = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/URL.properties");
		FileInputStream FIS = new FileInputStream(src);
		Properties PROP = new Properties();
		PROP.load(FIS);

		// Reading credentials data from creden.properties
		File src1 = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/creden.properties");
		FileInputStream FIS1 = new FileInputStream(src1);
		Properties PROP1 = new Properties();
		PROP1.load(FIS1);

		// Reading locator data from Locator.Properties
		File src2 = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/Locator.properties");
		FileInputStream FIS2 = new FileInputStream(src2);
		Properties PROP2 = new Properties();
		PROP2.load(FIS2);

		// Open the browser from reading data from URL.Properties
		System.setProperty(PROP.getProperty("driverProperty"), PROP.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.get(PROP.getProperty("URL"));
		System.out.println("Current URL : " + driver.getCurrentUrl());

		// Taken locator and credentials data from files
		driver.findElement(By.xpath(PROP2.getProperty("Email"))).sendKeys(PROP1.getProperty("TestData1"));
		driver.findElement(By.xpath(PROP2.getProperty("Password"))).sendKeys(PROP1.getProperty("TestData2"));
		driver.findElement(By.xpath(PROP2.getProperty("LogInButton"))).click();

		String ExpectedResult = "The password that you've entered is incorrect Forgotten password?";
		if (ExpectedResult.equalsIgnoreCase(ExpectedResult)) {
			System.out.println("Entered incorrect credentials");
		} else {
			System.out.println("Entered correct credentials");
		}

	}

}
