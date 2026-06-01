package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton4 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		List<WebElement> radios = driver.findElements(By.xpath("//input[contains(@class,'_8esa')]")); // Locator used contains to handle dynamic locators
		System.out.println("Radio BUttons" + radios.size());
		String handledbydynamic = "Custom";
		for (WebElement element : radios) {
			if (element.getText().equalsIgnoreCase(handledbydynamic)) {
				element.click();
				System.out.println(handledbydynamic + "clicked");
			}
		}

	}

}
