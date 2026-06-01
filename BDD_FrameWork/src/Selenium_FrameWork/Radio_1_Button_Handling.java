package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radio_1_Button_Handling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		// Explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create new account']"))).click();

		// Radio Button Handling
		List<WebElement> radioButton = driver.findElements(By.xpath("//label[@class='58_mt']"));
		System.out.println("All Radio Button : " + radioButton.size());

		String expResult = "Male";

		for (WebElement element : radioButton) {
			if (element.getText().equalsIgnoreCase(expResult)) {
				element.click();
				System.out.println(expResult + "clicked");
			}
		}

	}

}
