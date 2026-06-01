package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation4 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.flipkart.com/electronics-republic-day-sale-dt-store");

		// Maximize the screen
		driver.manage().window().maximize();

		WebElement TV = driver.findElement(By.xpath("//*[text()='TVs & Appliances']"));
		Actions act = new Actions(driver);
		act.moveToElement(TV).build().perform();
		driver.findElement(By.xpath("//*[text()='Refrigerators")).click();
		act.sendKeys(TV, Keys.ENTER);

	}

}
