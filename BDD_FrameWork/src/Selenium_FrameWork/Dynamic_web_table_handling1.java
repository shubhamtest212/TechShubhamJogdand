package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_web_table_handling1 {

	public static void main(String[] args) throws Exception {

		// Handling dynamic web table
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");

		// Create list of all companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total all companies : " + allCompanies.size());

		// Create list of Group
		List<WebElement> allGroup = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
		System.out.println("All Group : " + allGroup.size());
		Thread.sleep(10000);

		String expResult = "Picturehouse Media";

		for (int i = 0; i < allCompanies.size(); i++) {
			if (allCompanies.get(i).getText().equalsIgnoreCase(expResult)) {
				System.out.println(allCompanies.get(i).getText() + "===" + allGroup.get(i).getText());
				allCompanies.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}

	}

}
