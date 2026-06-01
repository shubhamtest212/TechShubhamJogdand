package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Implicit Explicit Waits

public class Implict_Explicit_Waits {

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Clicked on create new account
		driver.findElement(By.id("email")).sendKeys("TEST1");

		// Fetch email input box attribute value
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));

		// Use explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("xyz");
		System.out.println(driver.findElement(By.id("passWR")).getAttribute("value"));

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait1 = new WebDriverWait(driver, 400);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("test1");
	}

}
