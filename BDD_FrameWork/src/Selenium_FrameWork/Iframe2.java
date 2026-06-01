package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.paytm,com");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		// Find the total number of iframes present on the web page
		int allFrames = driver.findElements(By.tagName("ifram")).size();
		System.out.println("Total frames : " + allFrames);

		// Check if the element is present or not
		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String expectedText = "Open Paytm App";
			String actualText = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();

			if (actualText.equalsIgnoreCase(expectedText)) {
				System.out.println("Element present on the web page");
				break;
			} else {
				System.out.println("Element not present on the web page");
			}
		}

	}

}
