package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/electronics-republic-day-sale-dt-store");

		Actions act = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform();
		System.out.println("men option clicked");

	}

}
