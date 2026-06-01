package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args) throws Exception {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Implict wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Open the url
		driver.get("https://demoqa.com/browser-windows");

		// Maximize the screen
		driver.manage().window().maximize();

		// Step 1 tab handling
		Thread.sleep(500);
		driver.findElement(By.id("tabButton")).click();

		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All window handles : " + allWindowsId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("parent windonw id : " + parentWindowId);

		for (String abcd : allWindowsId) {
			driver.switchTo().window(abcd);
			if (abcd.equalsIgnoreCase(parentWindowId)) {
				System.out.println("parent tab title : " + driver.getTitle());
			} else {
				System.out.println("child tab url : " + driver.getCurrentUrl());
			}
		}
		Thread.sleep(2000);
		driver.close();

		// Step 2- Window Handling
		driver.switchTo().window(parentWindowId);
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('windowButton').click()");
		Set<String> allWindowsId2 = driver.getWindowHandles();
		System.out.println("All window ID2 : " + allWindowsId2);

		for (String window : allWindowsId2) {
			driver.switchTo().window(window);
			System.out.println("windows Id : " + window);
			System.out.println("Title : " + driver.getTitle());
			System.out.println("URL : " + driver.getCurrentUrl());
		}
		Thread.sleep(1000);
		driver.quit();
		System.out.println("windows and Tabs handled ");

	}

}
