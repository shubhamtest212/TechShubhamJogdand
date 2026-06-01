package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDropHandling3 {

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

		// 3rd way to handle dropdown
		WebElement w1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(w1);
		month.selectByIndex(1);
		System.out.println(month.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		month.selectByIndex(2);
		System.out.println(month.getFirstSelectedOption().getText());
		month.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println(month.getFirstSelectedOption().getText());

	}

}
