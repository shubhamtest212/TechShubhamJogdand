package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton5 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("//input[@id=\"sex\"]")).click(); // Locator used here as id
		driver.findElement(By.className("//input[@class=\"_8esa\"]")).click(); // Locator used here as className
		driver.findElement(By.className("//input[@class=\"_8esa\"][@id=\"sex\"]")).click(); // Multiple locator used // here as className and id


		List<WebElement> radios = driver.findElements(By.xpath("//input[contains(@id,'sex')]"));
		System.out.println("RadioButtonHandled" + radios.size());
		String expectedResult = "Female";
		for (WebElement element : radios) {
			if (element.getText().equalsIgnoreCase(expectedResult)) {
				element.click();
				System.out.println(expectedResult + "clicked");
			}
		}

	}

}
