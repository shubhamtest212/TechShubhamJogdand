package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlings1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/browser-windows");

		// step 1 : window handling
		Thread.sleep(5000);
		driver.findElement(By.id("windowButton")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println("All Window Id : " + allWindowId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + parentWindowId);

		for (String abcd : allWindowId) {
			driver.switchTo().window(parentWindowId);
			System.out.println("Title : " + driver.getTitle());
			System.out.println("URL : " + driver.getCurrentUrl());

		}

	}
}
