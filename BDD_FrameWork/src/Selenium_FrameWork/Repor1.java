package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repor1 {

	public static void main(String[] args) throws Exception {

		File src = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository2/testdata.properties");
		FileInputStream FIS = new FileInputStream(src);
		Properties PRO = new Properties();
		PRO.load(FIS);

		System.setProperty(PRO.getProperty("driverProperty"), PRO.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(PRO.getProperty("URL"));

	}

}
