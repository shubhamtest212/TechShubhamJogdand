package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAvailableOnWebPage {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.google.co.in/");

		// Maximize the screen
		driver.manage().window().maximize();

		List<WebElement> abc = driver.findElements(By.tagName("a"));
		int num = abc.size();
		System.out.println(abc);
		for (int i = 0; i <= num - 1; i++) {
			String c = abc.get(i).getText();
			System.out.println(c);

		}

	}

}
