package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// launch the url
		driver.get("https://paytm.com");
		System.out.println(driver.getTitle());

		// click on sign in button
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		// find out all the frames present on the web page
		int allframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println("all frames present on the web page are :" + allframe);

		// click on each frame present on web page
		for (int i = 0; i < allframe; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String expResult = "To create an account download Paytm App";
			String actResult = driver.findElement(By.xpath("//*[text()='To create an account download Paytm App']"))
					.getText();

			if (actResult.equalsIgnoreCase(expResult)) {
				System.out.println("Element found");
				break;
			} else {
				System.out.println("Element not found");
			}
		}

	}

}
