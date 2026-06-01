package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop_up_handling_1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Launch the URL
		driver.get("https://demoqa.com/browser-windows");

		// pop-up handling
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		Set<String> allWindowsId = driver.getWindowHandles();

		System.out.println("all windows id : " + allWindowsId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("parent window id : " + parentWindowId);

		for (String abc : allWindowsId) {
			driver.switchTo().window(abc);
			if (abc.equalsIgnoreCase(parentWindowId)) {
				System.out.println("parent tab title : " + driver.getTitle());
			} else {
				System.out.println("child window id : " + driver.getCurrentUrl());
			}
		}
	}

}
