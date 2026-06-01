package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_NG_SDET_2 {

	WebDriver driver;

	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://stage.rocketbees.in/rb_b2c_cms/login");

	}

	@DataProvider
	public Object[][] dataSet() {

		Object arr[][] = new Object[3][2];

		arr[0][0] = "TestData1";
		arr[0][1] = "TestData1";

		arr[1][0] = "TestData2";
		arr[1][1] = "TestData2";

		arr[2][0] = "TestData3";
		arr[2][1] = "TestData3";

		return arr;

	}

	@Test(dataProvider = "dataSet")
	public void enterData(String userName, String password) throws Exception {
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
