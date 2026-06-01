package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDropHandling5 {

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

		// 4th way to handle dropdown for year
		List<WebElement> yearlist = driver.findElements(By.xpath("//select[@name='birthday_year']/option"));
		System.out.println("Year listing : " + yearlist.size());
		String expectedResult = "1999";
		for (WebElement element : yearlist) {
			if (element.getText().equalsIgnoreCase(expectedResult)) {
				element.click();
				System.out.println(expectedResult + "clicked");
			}
		}

	}

}
