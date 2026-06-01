package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");

		// Alert by javascriptexecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("document.getElementById('confirmButton').click()");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-500)");

	}

}
