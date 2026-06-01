package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait2 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.facebook.com");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Maximize the screen
		driver.manage().window().maximize();

		// Explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.elementToBeClickable(By.name("email"))).sendKeys("SHUBHAM");
		wt.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("SHUBHAM@2022");

		// Fetch attribute value for the name and id input box
		System.out.println(driver.findElement(By.name("email")).getAttribute("value"));
		System.out.println(driver.findElement(By.id("pass")).getAttribute("value"));

	}

}
