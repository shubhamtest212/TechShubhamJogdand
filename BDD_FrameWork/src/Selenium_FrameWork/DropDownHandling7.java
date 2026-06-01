package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling7 {

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

		// SelectByVisibleText
		WebElement as = driver.findElement(By.xpath("//select[@id=\"month\"]"));

		Select month2 = new Select(as);
		month2.selectByVisibleText("May");
		System.out.println(month2.getFirstSelectedOption().getText());
		driver.close();

		List<WebElement> dropdown = month2.getOptions();
		System.out.println("Total months : " + dropdown.size());
		for (WebElement element : dropdown) {
			if (element.getText().equalsIgnoreCase("Oct")) {
				element.click();
			}
		}

	}

}
