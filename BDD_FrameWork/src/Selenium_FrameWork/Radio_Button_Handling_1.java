package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button_Handling_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// Radio Button Handling

		List<WebElement> radioButton = driver.findElements(By.xpath("//label[@class='58_mt']"));
		System.out.println("Radio Button : " + radioButton);

		String expResult = "Male";

		for (WebElement element : radioButton) {
			if (element.getText().equalsIgnoreCase(expResult)) {
				element.click();
				System.out.println(expResult + "clicked");
			}

		}

	}

}
