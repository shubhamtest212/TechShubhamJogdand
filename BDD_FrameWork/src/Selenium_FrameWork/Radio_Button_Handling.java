package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button_Handling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		List<WebElement> allRadioButton = driver.findElements(By.xpath("//label[@class='58_mt']"));
		System.out.println("Radio Buttons : " + allRadioButton.size());

		String expResult = "Female";

		for (WebElement abc : allRadioButton) {
			if (abc.getText().equalsIgnoreCase(expResult)) {
				abc.click();
				System.out.println(expResult + "clicked");
			}

		}

	}

}
