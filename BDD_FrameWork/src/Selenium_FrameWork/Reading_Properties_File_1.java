package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reading_Properties_File_1 {

	public static void main(String[] args) throws Exception {

		// configure properties
		File src1 = new File(
				"/home/shubham.jogdand@firstcry.io/git/SDET_Engineer_Shubham_Jogdand/BDD_FrameWork/Repository_3/Configure.properties");
		FileInputStream fis = new FileInputStream(src1);
		Properties pro1 = new Properties();
		pro1.load(fis);

		// locators properties
		File src2 = new File(
				"/home/shubham.jogdand@firstcry.io/git/SDET_Engineer_Shubham_Jogdand/BDD_FrameWork/Repository_3/locators.properties");
		FileInputStream fis2 = new FileInputStream(src2);
		Properties pro2 = new Properties();
		pro2.load(fis2);

		// testdata properties
		File src3 = new File(
				"/home/shubham.jogdand@firstcry.io/git/SDET_Engineer_Shubham_Jogdand/BDD_FrameWork/Repository_3/testdata.properties");
		FileInputStream fis3 = new FileInputStream(src3);
		Properties pro3 = new Properties();
		pro3.load(fis3);

		System.setProperty("webdriver.chrome.driver", pro1.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("URL1"));

		driver.findElement(By.name(pro2.getProperty("Email_1"))).sendKeys(pro3.getProperty("Email_TestData"));

	}

}
