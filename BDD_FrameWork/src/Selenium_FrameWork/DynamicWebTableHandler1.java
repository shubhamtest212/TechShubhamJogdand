package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandler1 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://money.rediff.com/gainers");

		// maximize the chrome
		driver.manage().window().maximize();

		// Dynamic web table handling
		List<WebElement> allcompanieslist1 = driver
				.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]//a"));
		System.out.println("allcompanieslist1 : " + allcompanieslist1.size());

		List<WebElement> allcompanieslist2 = driver
				.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));
		System.out.println("allcompanieslist2 : " + allcompanieslist2.size());

		String ExpectedResult = "Pratiksha Chemicals";

		for (int i = 0; i < allcompanieslist1.size(); i++) {
			if (allcompanieslist1.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				System.out.println(allcompanieslist1.get(i).getText() + "=======" + allcompanieslist2.get(i).getText());
				allcompanieslist1.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}

	}

}
