package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptExecutor_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stagelogistics.brainbees.com/login");

		WebDriverWait wt = new WebDriverWait(driver, 40);
		wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("email")));
		wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("password")));

		// JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Correct way (use index [0])
		jse.executeScript("document.getElementsByName('email')[0].value='shubham.jogdand@firstcry.in'");
		jse.executeScript("document.getElementsByName('password')[0].value='QAengineer@123'");

	}

}
