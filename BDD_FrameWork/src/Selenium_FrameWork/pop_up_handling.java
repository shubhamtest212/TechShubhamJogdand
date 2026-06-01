package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop_up_handling {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Launch the URL
		driver.get("https://demoqa.com/browser-windows");

		// step 1: Tab Handling
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All Windows Id : " + allWindowsId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + parentWindowId);

		for (String xyz : allWindowsId) {
			driver.switchTo().window(xyz);
			if (xyz.equalsIgnoreCase(parentWindowId)) {
				System.out.println("Parent tab title : " + driver.getTitle());
			} else {
				System.out.println("child tab url : " + driver.getCurrentUrl());
			}
		}
		Thread.sleep(5000);
		driver.close();
	}

}
