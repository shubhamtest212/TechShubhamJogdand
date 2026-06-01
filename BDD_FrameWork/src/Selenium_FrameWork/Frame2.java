package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.paytm.com");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		// Maximize the screen
		driver.manage().window().maximize();

		// Find all the frames available on the webpage
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("AllAvailableFrames :" + allFrames);

		// check if the element is present or not
		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String expText = "Login with your Paytm account";
			String actText = driver.findElement(By.xpath("//*[text()='Login with your Paytm account']")).getText();

			if (actText.equalsIgnoreCase(actText)) {
				System.out.println("Element found");
			} else {
				System.out.println("Element not found");
			}

		}

	}

}
