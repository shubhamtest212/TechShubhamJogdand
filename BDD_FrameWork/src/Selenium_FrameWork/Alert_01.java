package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_01 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/alerts");

		// Alert Accepted by using JavascriptExecutor
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('confirmButton').click()");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Alter Accepted");

		// Alert dismissed by using javascriptExecutor
		jse.executeScript("document.getElementById('confirmButton').click()");
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed here");

	}

}
