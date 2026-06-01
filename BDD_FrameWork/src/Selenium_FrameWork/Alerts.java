package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/alerts");

		// Explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 40);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();

		// Accept Alert by using JavaScriptExecutor
		JavaScriptExecutor jse = (JavaScriptExecutor) driver;
		jse.executeScript("document.getElementById('confirmButton').click()");
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");

	}

}
