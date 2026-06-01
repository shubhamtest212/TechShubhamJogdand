package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repository1 {

	public static void main(String[] args) throws Exception {

		File src = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository2/testdata.properties");
		FileInputStream fis1 = new FileInputStream(src);
		Properties pro1 = new Properties();
		pro1.load(fis1);

		System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.get(pro1.getProperty("URL"));

	}

}
