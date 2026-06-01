package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		// Xpath Locators
		driver.findElement(By.xpath("//input[@id='_R_1h6kqsqppb6amH1_'][@name='email']")).sendKeys("SHUBHAM");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("SHUBHAMJOGDAND");
		driver.findElement(By.xpath("//div[contains(@role,'button')]")).click();

	}

}
