package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popHandling3 {

	public static void main(String[] args) {

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

		// Tab Handling
		driver.findElement(By.id("tabButton")).click();
		Set<String> AllWindowsId = driver.getWindowHandles();
		System.out.println("All Windows Id : " + AllWindowsId);

		// Parent tab
		String ParentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + ParentWindowId);

	}

}
