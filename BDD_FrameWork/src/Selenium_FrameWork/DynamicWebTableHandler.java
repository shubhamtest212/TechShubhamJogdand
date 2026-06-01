package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandler {

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
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("allcompanies :" + list.size());

		// list of all companies
		List<WebElement> list1 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("currentprice : " + list1.size());

		String expectedResult = "T T";

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equalsIgnoreCase(expectedResult)) {
				System.out.println(list.get(i).getText() + "====" + list1.get(i).getText());
				list.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}

	}

}
