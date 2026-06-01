package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	// This programme is written for Handling dynamic web element

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://money.rediff.com/gainers");

		// maximize the chrome
		driver.manage().window().maximize();

		// List of all companies
		List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("AllCompanies : " + allcompanies.size());

		// List of all companies
		List<WebElement> allcurrentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("AllCurrentPrice : " + allcurrentprice.size());

		String expectedResult = "Ganga Pharmaceutical";

		for (int i = 0; i < allcompanies.size(); i++) {
			if (allcompanies.get(i).getText().equalsIgnoreCase(expectedResult)) {
				System.out.println(allcompanies.get(i).getText() + "====" + allcurrentprice.get(i).getText());
				allcompanies.get(i).click();
				System.out.println(driver.getTitle());
				break;

			}

		}

	}
}
