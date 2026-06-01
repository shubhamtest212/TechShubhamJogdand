package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		// Find the total frames are present on the webpage
		int allFrame = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames : " + allFrame);

		// check if the element is present or not
		for (int i = 0; i < allFrame; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String expText = "Open Paytm App";
			String actText = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();

			if (actText.equalsIgnoreCase(expText)) {
				System.out.println("Element found");
				break;
			} else {
				System.out.println("Element not found");
			}

		}

	}

}

// Start studing from 24:22
