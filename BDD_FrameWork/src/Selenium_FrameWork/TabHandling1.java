package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/browser-windows");

		// step 1 : handling tab
		Thread.sleep(5000);
		driver.findElement(By.id("tabButton")).click();
		Set<String> tabHandling = driver.getWindowHandles();
		System.out.println("TAB HANDLING : " + tabHandling);

		String parentTab = driver.getWindowHandle();
		System.out.println("PARENT TAB : " + parentTab);

		for (String abcd : tabHandling) {
			driver.switchTo().window(abcd);
			if (abcd.equalsIgnoreCase(parentTab)) {
				System.out.println("Parent Tab Handled");
			} else {
				System.out.println("Child Tab Handled");
			}

		}

	}

}
