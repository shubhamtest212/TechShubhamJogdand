package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling5 {

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
		Thread.sleep(3000);

		// Select By Value
		WebElement xy = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select month = new Select(xy);
		Thread.sleep(1000);
		month.selectByValue("11");
		System.out.println(month.getFirstSelectedOption().getText());

	}

}
