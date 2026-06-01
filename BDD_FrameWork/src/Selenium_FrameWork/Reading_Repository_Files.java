package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reading_Repository_Files {

	public static void main(String[] args) throws Exception {

		// Reading Repository files
		File src = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/test1.properties");

		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);

		System.setProperty(pro.getProperty("driverProperty"), pro.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.get(pro.getProperty("URL"));

		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys("TestData1");
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys("TestData1");

	}

}
