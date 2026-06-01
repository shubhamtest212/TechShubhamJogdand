package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication3 {

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

		// Way to handle radio buttons
		List<WebElement> radiobutton1 = driver.findElements(By.xpath("//label[@class=\"_58mt\"]"));
		System.out.println("Total Radio Buttons are : " + radiobutton1.size());
		String expectedResult = "Custom";
		for (WebElement element : radiobutton1) {
			if (element.getText().equalsIgnoreCase(expectedResult)) {
				element.click();
				driver.close();

			}
		}

	}

}
