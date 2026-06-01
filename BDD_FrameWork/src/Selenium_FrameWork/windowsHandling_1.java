package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandling_1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		// step 1 : Tab handling
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All Windows Id : " + allWindowsId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + parentWindowId);

		for (String abcd : allWindowsId) {
			driver.switchTo().window(abcd);
			if (abcd.equalsIgnoreCase(parentWindowId)) {
				System.out.println("parent tab title : " + driver.getTitle());
			}
		}

		// step 2 - window handling
		driver.switchTo().window(parentWindowId);
		Thread.sleep(3000);
		JavaScriptExecutor jse = (JavaScriptExecutor) driver;

	}

}
