package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tab_Handling_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		// Explicit Wait
		WebDriverWait wt = new WebDriverWait(driver, 40);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("tabButton"))).click();

		// Set is a collection of API and will allow unique string as return type
		// List will allow all elements
		// getWindowHandles will return you all windows
		// getWindowHandle will return you only one window

		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("AllWindowsId : " + allWindowsId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + parentWindowId);

		for (String xyz : allWindowsId) {
			driver.switchTo().window(parentWindowId);
			if (xyz.equalsIgnoreCase(parentWindowId)) {
				System.out.println("Parent Tab Title : " + driver.getTitle());
			} else {
				System.out.println("Child Tab URL : " + driver.getCurrentUrl());
			}
		}

		// Window Handling
		driver.switchTo().window(parentWindowId);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('windowButton').click()");
		Set<String> allWindowsId2 = driver.getWindowHandles();
		System.out.println("All Windows Id : " + allWindowsId2);

		String parentWindowId2 = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + parentWindowId2);

		for (String abcd : allWindowsId2) {
			driver.switchTo().window(parentWindowId2);
			if (abcd.equalsIgnoreCase(parentWindowId2)) {
				System.out.println("Parent Window URL : " + driver.getTitle());
			} else {
				System.out.println("Child Window URL : " + driver.getTitle());
			}
		}
		driver.quit();
	}

}
