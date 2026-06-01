package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popHandling {

	public static void main(String[] args) throws Exception {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://demoqa.com/browser-windows");

		// Maximize the screen
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Step 1- Tab Handling
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All Windows Id : " + allWindowsId);

		// Parent Windows Id
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + parentWindowId);

		for (String xyz : allWindowsId) {
			driver.switchTo().window(xyz);
			if (xyz.equalsIgnoreCase(parentWindowId)) {
				System.out.println("Parent Tab Title : " + driver.getTitle());
			} else {
				System.out.println("Child tab URL : " + driver.getCurrentUrl());
			}
		}
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
