package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling6 {

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

		// SelectByIndex
		WebElement ab = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select month1 = new Select(ab);
		month1.selectByIndex(3);
		System.out.println(month1.getFirstSelectedOption().getText());

		List<WebElement> dropdown = month1.getOptions();
		System.out.println("Total DropDown for months :" + dropdown.size());
		for (WebElement element : dropdown) {
			if (element.getText().equalsIgnoreCase("Mar")) {
				element.click();
				driver.close();
			}
		}

	}

}
