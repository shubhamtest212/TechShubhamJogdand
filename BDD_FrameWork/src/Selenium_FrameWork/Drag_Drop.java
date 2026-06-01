package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/electronics-republic-day-sale-dt-store");

		Actions act = new Actions(driver);

		// Mouse simulation using Actions class
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		Thread.sleep(3000);
		act.moveToElement(electro).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//[text()='Realme']")).click();

		// Keyboard operations
		WebElement men = driver.findElement(By.xpath("//[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform();
		System.out.println("Men Option Clicked");

	}

}
