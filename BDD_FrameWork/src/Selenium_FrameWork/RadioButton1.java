package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

	public static void main(String[] args) throws Exception {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// 1st Way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click(); // Female
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click(); // Male
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"-1\"]")).click(); // CUstom
		Thread.sleep(2000);

		// 2nd Way
		List<WebElement> radios = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total Radio button" + radios.size());
		String ExpectedResult = "Female";
		for (WebElement element : radios) {
			if (element.getText().equalsIgnoreCase(ExpectedResult)) {
				element.click();
				System.out.println(ExpectedResult + "clicked");
			}
		}

	}

}
