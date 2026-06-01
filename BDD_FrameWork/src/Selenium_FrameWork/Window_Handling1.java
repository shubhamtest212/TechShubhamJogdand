package Selenium_FrameWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		// messageWindowButton
		driver.findElement(By.id("messageWindowButton")).click();

		Set<String> window1 = driver.getWindowHandles();
		System.out.println("Window : " + window1);

		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Id : " + parentWindow);

		for (String abcd : window1) {
			driver.switchTo().window(parentWindow);
			if (abcd.equalsIgnoreCase(parentWindow)) {
				System.out.println("Parent Window URL : " + driver.getCurrentUrl());
			} else {
				System.out.println("Child Window URL : " + driver.getCurrentUrl());
			}
		}

	}

}
