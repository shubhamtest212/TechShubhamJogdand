package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebTableHandling3 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://money.rediff.com/gainers");

		// Maximize the screen
		driver.manage().window().maximize();

		// Explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"grey\"]"))).click();

		// Click on next page
		driver.findElement(By.xpath("//a[@class=\"grey\"]")).click();

		// List of All companies available on 2nd page once clicked on next button
		List<WebElement> allcompaniesonnextbutton = driver
				.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("AllCompaniesAvaialbleOnSecondPage : " + allcompaniesonnextbutton.size());

		// List of CurrentPrice of paricular selected companies
		List<WebElement> allcurrentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("AllCurrentPriceOfCompanies : " + allcurrentprice.size());

		String expectedResult = "Godavari Drugs";

		for (int i = 0; i < allcompaniesonnextbutton.size(); i++) {
			if (allcompaniesonnextbutton.get(i).getText().equalsIgnoreCase(expectedResult)) {
				System.out
						.println(allcompaniesonnextbutton.get(i).getText() + "====" + allcurrentprice.get(i).getText());
				allcompaniesonnextbutton.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}

		}
	}
}
