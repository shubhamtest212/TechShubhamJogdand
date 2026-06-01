package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Available_On_Web_Page_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> abc = driver.findElements(By.tagName("a"));
		int num = abc.size();
		System.out.println(num);

		for (int i = 0; i < num; i++) {
			String c = abc.get(i).getText();
			Thread.sleep(2000);
			System.out.println(c);
		}

		// Close browser after loop
		driver.close();
	}
}