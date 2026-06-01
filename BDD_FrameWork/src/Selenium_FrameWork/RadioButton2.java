package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		List<WebElement> radios = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Get All Available Radio Button" + radios.size());
		String expectedResult = "Male";
		for (WebElement element : radios) {
			if (element.getText().equalsIgnoreCase(expectedResult)) {
				element.click();
				System.out.println(expectedResult + "clicked");
			}

		}

	}

}
