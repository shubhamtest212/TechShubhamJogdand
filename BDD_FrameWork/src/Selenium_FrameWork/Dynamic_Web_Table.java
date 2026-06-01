package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Web_Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com");

		// Handling Dynamic Web Table
		// Create list of all companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies : " + allCompanies.size());

		// Create a list of all price
		List<WebElement> allCurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("All Current Company Price : " + allCurrentPrice.size());

		String expResult = "Talbros Auto.";

		for (int i = 0; i < allCompanies.size(); i++) {
			if (allCompanies.get(i).getText().equalsIgnoreCase(expResult)) {
				System.out.println(allCompanies.get(i).getText() + "==" + allCurrentPrice.get(i).getText());
				allCompanies.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}

		}

	}

}
