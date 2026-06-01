package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {

		// Drag & Drop
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/electronics-republic-day-sale-dt-store");

		// create webelements by using web element ref
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));

		// mouse simulation using actions class
		Actions act = new Actions(driver);
		// mouse hovering to electronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();

	}

}
