package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button_Handling2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// Radio button handling
		List<WebElement> radioButton1 = driver.findElements(By.xpath("//label[@class='58_mt']"));
		System.out.println("Total Radio Button : " + radioButton1.size());
		String expResult = "Male";
		for (WebElement element : radioButton1) {
			if (element.getText().equalsIgnoreCase(expResult)) {
				element.click();
				System.out.println(expResult + "clicked");
			}
		}

	}

}
