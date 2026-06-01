package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling1 {

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

		// 1st way
		driver.findElement(By.className("//select[@name=\"birthday_day\"]")).sendKeys("12"); // name locator used here
																								// 12
		driver.findElement(By.id("month")).sendKeys("June"); // Id locator used here June
		driver.findElement(By.xpath("//select[@title=\"Year\"]")).sendKeys("1999"); // xpath locator used here 1999

		// 2nd way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total DropDown Values :" + birthMonth.size());
		birthMonth.get(3).click();
		Thread.sleep(1000);
		birthMonth.get(8).click();

		// 3rd way
		WebElement SJ = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select month = new Select(SJ);
		Thread.sleep(2000);
		month.selectByVisibleText("Jun");
		Thread.sleep(3000);
		month.selectByIndex(6);
		Thread.sleep(3000);
		month.selectByValue("4");
		System.out.println(month.getFirstSelectedOption().getText());

		// 4th way
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total dropdown value 2n time :" + dropdown.size());
		for (WebElement element : dropdown) {
			if (element.getText().equalsIgnoreCase("Dec")) {
				element.click();

			}

		}
	}
}
