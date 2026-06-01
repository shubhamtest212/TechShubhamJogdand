package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_web_table_handling_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");

		// create all companies list
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("All Companies List : " + allCompanies);

		// create all price of each companies
		List<WebElement> allPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("All price of each Companies: " + allPrice);

		String expResult = "ICDS";

		for (int i = 0; i < allCompanies.size(); i++) {
			if (allCompanies.get(i).getText().equalsIgnoreCase(expResult)) {
				System.out.println(allCompanies.get(i).getText() + "=======" + allPrice.get(i).getText());
				allCompanies.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}

		}

	}

}
