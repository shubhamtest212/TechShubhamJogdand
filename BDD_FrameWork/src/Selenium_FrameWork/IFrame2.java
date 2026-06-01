package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		// Find the total frames present on the web page
		int allFrames1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames : " + allFrames1);

		// check if the element is present or not
		for (int i = 0; i < allFrames1; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String expText = "Login with your Paytm account";
			String actText = driver.findElement(By.xpath("//*[text()='Login with your Paytm account']")).getText();

			if (actText.equalsIgnoreCase(expText)) {
				System.out.println("Element found");
				break;
			} else {
				System.out.println("Element not found");
			}
		}
	}

}
