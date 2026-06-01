package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDropHandling1 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.facebook.com");

		// Maximize the screen
		driver.manage().window().maximize();

		// Clicked on create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// 1st way to handle dropdown
		driver.findElement(By.name("birthday_day")).sendKeys("12");
		driver.findElement(By.id("month")).sendKeys("June");
		driver.findElement(By.id("year")).sendKeys("1999");
		System.out.println(driver.findElement(By.name("birthday_day")).getAttribute("value"));
		System.out.println(driver.findElement(By.id("month")).getAttribute("value"));
		System.out.println(driver.findElement(By.id("year")).getAttribute("value"));

	}

}
