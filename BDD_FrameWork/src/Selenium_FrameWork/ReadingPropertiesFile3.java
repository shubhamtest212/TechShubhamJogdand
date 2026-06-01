package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFile3 {

	public static void main(String[] args) throws IOException {

		// Reading configuration data from test1.properties
		File src1 = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/test1.properties");
		FileInputStream fis1 = new FileInputStream(src1);
		Properties pro1 = new Properties();
		pro1.load(fis1);

		// Open the browser
		System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.get(pro1.getProperty("URL"));
		System.out.println("URL : " + driver.getCurrentUrl());
		driver.findElement(By.xpath(pro1.getProperty("Email"))).sendKeys(pro1.getProperty("TestData1"));
		driver.findElement(By.xpath(pro1.getProperty("Password"))).sendKeys(pro1.getProperty("TestData2"));
		driver.findElement(By.xpath(pro1.getProperty("LogInButton"))).click();

		String expectedResult = "The password that you have entered is incorrect Forgotten password?";
		if (expectedResult.equalsIgnoreCase(expectedResult)) {
			System.out.println("You are Right");
		} else {
			System.out.println("you are incorrect");
		}

	}

}
