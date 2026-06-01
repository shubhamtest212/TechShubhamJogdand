package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDropHandling4 {

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

		// 4th way to handle dropdown
		List<WebElement> listmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Month are available : " + listmonth.size());
		String expectedResul1 = "Dec";
		for (WebElement element : listmonth) {
			if (element.getText().equalsIgnoreCase(expectedResul1)) {
				element.click();
				System.out.println(expectedResul1 + "clicked");
			}
		}

	}

}
