package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class Test_NG_SDET_3 {

	WebDriver driver;

	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

	}

	@DataProvider
	public Object[][] dataSet() {

		Object arr[][] = new Object[3][2];

		arr[0][0] = "TesData1";
		arr[0][1] = "TestData1";

		arr[1][0] = "TesData2";
		arr[1][1] = "TestData2";

		arr[2][0] = "TesData3";
		arr[2][1] = "TestData3";
		return null;

	}
	
	

}
