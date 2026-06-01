package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://demoqa.com");

		// step 1 : tab handling
		Thread.sleep(3000);
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All Windows : " + allWindowsId);

		String parentWindowId = driver.getWindowHandle();
		System.out.println("parent window id : " + parentWindowId);

		for (String xyz : allWindowsId) {
			driver.switchTo().window(parentWindowId);
			if (xyz.equalsIgnoreCase(parentWindowId)) {
				System.out.println("parent window id");
			} else {
				System.out.println("child window id");
			}
		}
	}

}
