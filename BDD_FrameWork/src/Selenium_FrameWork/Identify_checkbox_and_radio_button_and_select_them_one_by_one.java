package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_checkbox_and_radio_button_and_select_them_one_by_one {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/radio.html");

		List<WebElement> options = driver.findElements(By.name("webform"));
		int num = options.size();

		for (int i = 0; i < num - 1; i++) {
			options.get(i).click();
			System.out.println(options + "clicked");
		}

	}
}