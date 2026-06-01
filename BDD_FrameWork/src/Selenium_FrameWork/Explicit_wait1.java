package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait1 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.facebook.com");

		// Maximize the screen
		driver.manage().window().maximize();

		// Explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("SHUBHAM");
		wt.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("SHUBHAM@1299");
		wt.until(ExpectedConditions.elementToBeClickable(By.name("login"))).click();
		System.out.println("Title" + driver.getTitle());

	}

}
