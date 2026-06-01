package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button_Handling3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");


		// Radio button handling
		List<WebElement> radios = driver.findElements(By.xpath("//label[@class='58_mt']"));
		System.out.println("Total Radio buttons" + radios.size());
		String expResult = "Custom";

		for (WebElement element : radios) {
			if (element.getText().equalsIgnoreCase(expResult)) {
				element.click();
				System.out.println(expResult + "clicked");
			}
		}

	}

}
