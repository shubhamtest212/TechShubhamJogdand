package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:/www.paytm.com");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		// Find the total frames are present on the web page
		List<WebElement> allFrames1 = driver.findElements(By.tagName("iframes"));
		System.out.println("Total Frames : " + allFrames1.size());

	}

}
