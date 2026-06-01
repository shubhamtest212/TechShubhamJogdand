package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling_1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		// explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='tabButton']"))).click();

		// This code is written for tab handling
		Set<String> allwindowsId = driver.getWindowHandles();
		System.out.println("All Windows Id : " + allwindowsId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + parentWindowId);

		for (String abcd : allwindowsId) {
			if (abcd.equalsIgnoreCase(parentWindowId)) {
				System.out.println("parent tab title : " + driver.getTitle());
			} else {
				System.out.println("child window title : " + driver.getCurrentUrl());
			}
		}

		// This code is written for window handling
		driver.switchTo().window(parentWindowId);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('windowButton').click()");

		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All Windows Id : " + allWindowsId);

		for (String xyz : allWindowsId) {
			driver.switchTo().window(xyz);
			System.out.println("windows Id : " + xyz);
			System.out.println("Title : " + driver.getTitle());
			System.out.println("Current URL : " + driver.getCurrentUrl());

		}
		driver.close();
		System.out.println("all windows id closed");

	}

}
