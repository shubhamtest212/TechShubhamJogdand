package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2 {

	public static void main(String[] args) {

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

		// Step 1 - Window Handling
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("AllWindowsId : " + allWindowsId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("ParentWindowId : " + parentWindowId);

		for (String xyz : allWindowsId) {
			driver.switchTo().window(xyz);
			if (xyz.equalsIgnoreCase(parentWindowId)) {
				System.out.println("Parent Tab Title : " + driver.getTitle());
			} else {
				System.out.println("Child Tab URL : " + driver.getCurrentUrl());
			}
		}

	}

}
