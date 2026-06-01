package Selenium_FrameWork;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pop_up_tab_windows_handling_1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		// Explicit wait
		// Tab Handling
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("tabButton"))).click();

		// Set will not allowed duplicate
		// List will allowed duplicate
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All_Windows_Id : " + allWindowsId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + parentWindowId);

		for (String xyz : allWindowsId) {
			driver.switchTo().window(xyz);
			if (xyz.equalsIgnoreCase(parentWindowId)) {
				System.out.println("Parent Tab Title : " + driver.getTitle());
			} else {
				System.out.println("Child Tab URL : " + driver.getCurrentUrl());
			}

			Thread.sleep(2000);
			driver.close();
		}
	}

}
