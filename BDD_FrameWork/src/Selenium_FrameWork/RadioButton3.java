package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton3 {

	public static void main(String[] args) {
		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		List<WebElement> radios = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Radio Buttons" + radios.size());
		String expectedResult1 = "Custom";
		for (WebElement element : radios) {
			if (element.getText().equalsIgnoreCase(expectedResult1)) {
				element.click();
				System.out.println(expectedResult1 + "clicked");

			}
		}

	}

}
