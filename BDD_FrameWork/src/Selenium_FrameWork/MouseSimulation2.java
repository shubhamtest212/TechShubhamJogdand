package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.flipkart.com/electronics-republic-day-sale-dt-store");

		Actions act = new Actions(driver);
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Realme']")).click();

		// Keyboard operations
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform();
		System.out.println("Men options clicked");

	}

}
