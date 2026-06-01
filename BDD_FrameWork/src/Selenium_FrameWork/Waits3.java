package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook,com");

		// Explicit Wait
		WebDriverWait waits = new WebDriverWait(driver, 50);
		waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']"))).sendKeys("SHUBHAM");
		waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass']")))
				.sendKeys("SHUBHAMJOGDAND");

		// Fetch email input attribute value
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		System.out.println(driver.findElement(By.id("pass")).getAttribute("value"));

	}

}
