package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_01 {

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

		arr[0][0] = "Shubham1";
		arr[0][1] = "Jogdand1";

		arr[1][0] = "Shubham2";
		arr[1][1] = "Jogdand2";

		arr[2][0] = "Shubham3";
		arr[2][1] = "Jogdand3";
		return arr;
	}

	@Test(dataProvider = "dataSet")
	public void enterData(String userName, String password) throws Exception {
		Thread.sleep(500);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("email")).sendKeys(userName);
		Thread.sleep(500);
		driver.findElement(By.id("pass")).sendKeys(password);


	}

}
