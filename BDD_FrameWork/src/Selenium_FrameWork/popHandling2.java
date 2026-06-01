package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popHandling2 {

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

		// STEP 1 - TAB HANDLING
		driver.findElement(By.id("tabButton")).click();
		Set<String> AllWindowsId = driver.getWindowHandles();
		System.out.println("All Windows Id : " + AllWindowsId);

		// Parent Windows Id
		String ParentWindowsId = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + ParentWindowsId);

		for (String abcd : AllWindowsId) {
			driver.switchTo().window(abcd);
			if (abcd.equalsIgnoreCase(ParentWindowsId)) {
				System.out.println("Parent tab title : " + driver.getTitle());
			} else {
				System.out.println("Child Tab URL : " + driver.getCurrentUrl());

			}
		}
		Thread.sleep(2000);
		driver.close();
	}

}
