package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton6 {

	// This class code is written to handle radio buttons with multiple locators as
	// like single, multiple, contains() method and text() method with classname, id
	// and xpath locator

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//input[contains(@type,'radio')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'_8esa')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'_8esa')]")).isDisplayed(); // Is webelement displayed or
																							// not
		driver.findElement(By.xpath("//input[contains(@class,'_8esa')]")).isEnabled(); // Is webelement enabled or not
		driver.findElement(By.xpath("//input[contains(@class,'_8esa')]")).isSelected(); // Is webelement selected or not
		// Contains method used for dynamically webelement handling

		driver.findElement(By.className("//input[@class=\"_8esa\"]")).click(); // SINGLE LOCATOR
		driver.findElement(By.xpath("//input[@class=\"_8esa\"][@id=\"sex\"]")).click(); // MULTIPLE LOCATOR
		driver.findElement(By.xpath("//input[contains(@class,'_8esa')]")).click(); // CONTAINS() METHOD USED
		driver.findElement(By.xpath("//div[text()=\"It's quick and easy.\"]")).click(); // TEXT() METHOD USED

		List<WebElement> radios = driver.findElements(By.xpath("//input[contains(@class,'_8esa')]"));
		System.out.println("RADIOS BUTTON HANDLED WITH MULTIPLE LOCATOR" + radios.size());
		String Female = "Female";
		for (WebElement element : radios) {
			if (element.getText().equalsIgnoreCase(Female)) {
				element.click();
				System.out.println(Female + "clicked");

			}
		}

	}

}
