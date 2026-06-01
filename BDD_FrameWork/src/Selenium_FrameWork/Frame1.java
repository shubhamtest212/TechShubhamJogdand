package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.paytm.com");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		// Maximize the screen
		driver.manage().window().maximize();

		// Find all the Frames available on the web page
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Available frames are : " + allFrames);

		// Check if the element is present or not
		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String expText = "Open Paytm App";
			String actText = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();

			if (actText.equalsIgnoreCase(actText)) {
				System.out.println("Element found");
				break;
			} else {
				System.out.println("Element not found");

			}

		}

	}

}
