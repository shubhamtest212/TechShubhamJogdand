package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait1 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.facebook.com");

		// Maximize the screen
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Click on Create new Account
		driver.findElement(By.id("email")).sendKeys("Shubham");

		// Fetch email input box attribute value
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));

		// Explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("QAEngineer1");

	}

}
