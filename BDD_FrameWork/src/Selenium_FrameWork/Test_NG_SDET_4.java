package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_NG_SDET_4 {

	WebDriver driver;

	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}

	@DataProvider
	public Object[][] dataSet() {
		Object arr[][] = new Object[3][2];

		arr[0][0] = "TestData1";
		arr[0][1] = "TestData2";

		arr[1][0] = "TestData1";
		arr[1][1] = "TestData2";

		arr[2][0] = "TestData1";
		arr[2][1] = "TestData2";
		return arr;
	}

	@Test(dataProvider = "dataSet")
	public void enterDetails(String userName, String password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys(password);

	}

}
