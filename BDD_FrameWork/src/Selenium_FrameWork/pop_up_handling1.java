package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop_up_handling1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		// step 1 : tab handling
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All Windows Id : " + allWindowsId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + parentWindowId);

		for (String abcd : allWindowsId) {
			driver.switchTo().window(abcd);
			if (abcd.equalsIgnoreCase(parentWindowId)) {
				System.out.println("Parent tab title : " + driver.getCurrentUrl());
			} else {
				System.out.println("Child tab url : " + driver.getCurrentUrl());
			}
		}

		Thread.sleep(5000);
		driver.close();

		// step 2 : Window Handling
		driver.switchTo().window(parentWindowId);
		Thread.sleep(3000);
		// by using javascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('windowButton').click()");
		Set<String> allWindowsId2 = driver.getWindowHandles();
		System.out.println("All Windows Id : " + allWindowsId2);

		for (String window : allWindowsId2) {
			driver.switchTo().window(window);
			System.out.println("Windows Id : " + window);
			System.out.println("Title : " + driver.getTitle());
			System.out.println("URL : " + driver.getCurrentUrl());

		}
		Thread.sleep(4000);
		driver.quit();
		System.out.println("Windows and Tab handled");

	}

}
