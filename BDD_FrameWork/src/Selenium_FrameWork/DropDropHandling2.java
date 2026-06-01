package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDropHandling2 {

	public static void main(String[] args) throws Exception {

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

		// 2nd way to handle dropdown
		List<WebElement> BirthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("List of all element of date : " + BirthMonth.size());
		BirthMonth.get(5).click();
		Thread.sleep(3000);
		BirthMonth.get(9).click();

	}

}
