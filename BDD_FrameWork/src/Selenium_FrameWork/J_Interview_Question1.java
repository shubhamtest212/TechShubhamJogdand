package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class J_Interview_Question1 {

	public static void main(String[] args) {

		// JavascriptExecutor Interview Question - How to Check If Page is Completely
		// Loaded?

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		// JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String readyState = jse.executeScript("return document.readystate").toString();

		if (readyState.equals("complete")) {
			System.out.println("Page Loaded");
		} else {
			System.out.println("Page not loaded");
		}

	}

}
