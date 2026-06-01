package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.paytm.com");

		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("All frames : " + allFrames);

		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);
			String expResult = "Login with your Paytm account";
			String actResult = driver.findElement(By.xpath("//*[text()='Login with your Paytm account']")).getText();

			if (actResult.equalsIgnoreCase(expResult)) {
				System.out.println("Element found");
				break;
			} else {
				System.out.println("Element not found");
			}
		}

	}

}
