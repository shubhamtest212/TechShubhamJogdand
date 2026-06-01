package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling2 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://money.rediff.com/gainers");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// maximize the chrome
		driver.manage().window().maximize();

		// List of AllCompanies
		List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("AllCompanies : " + allcompanies.size());

		// List of All Group of Companies
		List<WebElement> allgroup = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
		System.out.println("allgroup : " + allgroup.size());

		// List of All companies Prev Close (Rs)
		List<WebElement> allprevclose = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
		System.out.println("allprevclose : " + allprevclose.size());

		// List of All companies Current Price (Rs)
		List<WebElement> allcurentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("allcurrentprice : " + allcurentprice.size());

		// List of All companies % Change
		List<WebElement> allcompanieschange = driver
				.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));
		System.out.println("allcompanieschange : " + allcompanieschange.size());

		// List of All companies trade of Dhan
		List<WebElement> allcompaniestradeofDhan = driver
				.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[6]"));
		System.out.println("allcompaniestradeofdhan : " + allcompaniestradeofDhan.size());

		String expectedResultforcompany = "Transworld Shipping";

		for (int i = 0; i < allcompanies.size(); i++) {
			if (allcompanies.get(i).getText().equalsIgnoreCase(expectedResultforcompany)) {
				System.out.print(allcompanies.get(i).getText() + "=====" + allgroup.get(i).getText() + "=====" + allprevclose.get(i).getText() + "====" + allcurentprice.get(i).getText() + "====" + allcompanieschange.get(i).getText() + "===" + allcompaniestradeofDhan.get(i).getText());
				allcompanies.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}

	}

}
