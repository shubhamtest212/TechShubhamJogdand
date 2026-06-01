package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radio_DropDown_ImplictWait1 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.facebook.com");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Maximize the screen
		driver.manage().window().maximize();

		// Use explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create new account']"))).click();

		// Radio Button handling for Female
		List<WebElement> FemaleRadio1 = driver.findElements(By.xpath("//label[@class=\"_58mt\"]"));
		System.out.println("Radio Buttons Available on WebPage: " + FemaleRadio1.size());
		String ExpectedResult = "Female";
		for (WebElement element : FemaleRadio1) {
			if (element.getText().equalsIgnoreCase(ExpectedResult)) {
				element.click();
				System.out.println(ExpectedResult + "clicked");

				// Select Female Date
				WebElement date = driver.findElement(By.xpath("//Select[@title=\"Day\"]"));
				Select date1 = new Select(date);
				date1.selectByValue("10");
				System.out.println(date1.getFirstSelectedOption().getText());

				// Select Female month
				WebElement month = driver.findElement(By.xpath("//Select[@title=\"Month\"]"));
				Select month1 = new Select(month);
				month1.selectByVisibleText("May");
				System.out.println(month1.getFirstSelectedOption().getText());

				// Select Female year
				WebElement year = driver.findElement(By.xpath("//Select[@title=\"Year\"]"));
				Select year1 = new Select(year);
				year1.selectByValue("2005");
				System.out.println(year1.getFirstSelectedOption().getText());
				driver.close();

			}
		}

	}

}
