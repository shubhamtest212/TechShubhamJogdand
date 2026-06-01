package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandling8 {

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

		// 2nd way
		List<WebElement> birthYear = driver.findElements(By.xpath("//select[@id=\"year\"]/option"));
		System.out.println("Total Birth Year " + birthYear.size());
		birthYear.get(100).click();
		Thread.sleep(1000);

		// for date
		List<WebElement> birthDate = driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		System.out.println("Total dates for the month " + birthDate.size());
		birthDate.get(11).click();
		System.out.println(birthDate);
		birthDate.get(0).click();

	}

}
