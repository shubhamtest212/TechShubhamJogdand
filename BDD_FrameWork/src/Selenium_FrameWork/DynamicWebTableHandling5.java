package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling5 {

	public static void main(String[] args) {
		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://money.rediff.com/indicators");

		// Maximize the window
		driver.manage().window().maximize();

		// List of All indexes available on the trends
		List<WebElement> allindexex = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr[1]"));
		System.out.println("allindexex : " + allindexex.size());

		// List of all last traded on the trends
		List<WebElement> alltraded = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th[2]"));
		System.out.println("alltraded : " + alltraded.size());

		// List of all changes on the trends
		List<WebElement> allchanges = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th[3]"));
		System.out.println("allchanges : " + allchanges.size());

		String ExpectedResult1 = "Hang Seng";

		for (int i = 0; i < allindexex.size(); i++) {
			if (allindexex.get(i).getText().equalsIgnoreCase(ExpectedResult1)) {
				System.out.println(allindexex.get(i).getText() + "====" + alltraded.get(i).getText() + "==="
						+ allchanges.get(i).getText());
				allindexex.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}

	}

}
