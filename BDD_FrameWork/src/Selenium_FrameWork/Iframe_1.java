package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver shubham = new ChromeDriver();
		shubham.manage().window().maximize();
		shubham.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		shubham.get("https://www.paytm.com/");

		shubham.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(3000);

		// Find the total number of frames present on the web page
		int allFrames = shubham.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames : " + allFrames);

		// Check if the element is present or not
		for (int i = 0; i < allFrames; i++) {
			shubham.switchTo().frame(i);
			shubham.switchTo().frame(i);

			String expText = "Open Paytm App";
			String actText = shubham.findElement(By.xpath("//*[text='Open Paytm App']")).getText();

			if (actText.equalsIgnoreCase(expText)) {
				System.out.println("Element found");
				break;
			} else {
				System.out.println("Element not found");
			}

		}

	}

}
