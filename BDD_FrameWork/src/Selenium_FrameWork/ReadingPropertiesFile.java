package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws Exception {

		// Config properties file
		File src1 = new File(
				"/home/shubham.jogdand@firstcry.io/git/TechShubhamJogdand/BDD_FrameWork/src/com/projectName/repository/config.properties");
		FileInputStream fis = new FileInputStream(src1);
		Properties pro1 = new Properties();
		pro1.load(fis);

		// Locator properties file
		File src2 = new File(
				"/home/shubham.jogdand@firstcry.io/git/TechShubhamJogdand/BDD_FrameWork/src/com/projectName/repository/locator.properties");
		FileInputStream fis2 = new FileInputStream(src2);
		Properties pro2 = new Properties();
		pro2.load(fis2);

		// TestData properties file
		File src3 = new File(
				"/home/shubham.jogdand@firstcry.io/git/TechShubhamJogdand/BDD_FrameWork/src/com/projectName/repository/testdata.properties");
		FileInputStream fis3 = new FileInputStream(src3);
		Properties pro3 = new Properties();
		pro3.load(fis3);

		System.setProperty("webdriver.chrome.driver", pro1.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("url"));

		
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
		
	}

}
