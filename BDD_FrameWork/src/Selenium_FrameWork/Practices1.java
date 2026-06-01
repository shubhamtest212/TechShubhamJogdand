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

public class Practices1 {

	public static void main(String[] args) throws Exception {
		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.facebook.com");

		// Implicit wait handled here
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Maximize the screen
		driver.manage().window().maximize();

		// Clicked on create new account and Explicit wait used here
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create new account']"))).click();

		// DropDown for Date
		WebElement date = driver.findElement(By.xpath("//select[contains(@id,'day')]"));
		Select date1 = new Select(date);
		date1.selectByIndex(29);
		System.out.println(date1.getFirstSelectedOption().getText());

		// DropDown for month
		WebElement month = driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		Select month1 = new Select(month);
		month1.selectByIndex(9);
		System.out.println(date1.getFirstSelectedOption().getText());

		// DropDown for Year
		WebElement year = driver.findElement(By.xpath("//select[contains(@id,'year')]"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("2005");
		System.out.println(year1.getFirstSelectedOption().getText());

		// Select Radio button - Female
		List<WebElement> radiobuttons1 = driver.findElements(By.xpath("//label[contains(@class,'_58mt')]"));
		System.out.println("Buttons" + radiobuttons1.size());
		String expectedresult1 = "Custom";
		for (WebElement element : radiobuttons1) {
			if (element.getText().equalsIgnoreCase(expectedresult1)) {
				element.click();
				System.out.println(expectedresult1 + "clicked");

				// Once select radio button as custom then select one of the dropdown
				WebElement customdropdown = driver.findElement(By.xpath("//select[contains(@id,'preferred_pronoun')]"));
				Select customdropdown1 = new Select(customdropdown);
				customdropdown1.selectByIndex(1);
				System.out.println(customdropdown1.getFirstSelectedOption().getText());
				Thread.sleep(5000);
				driver.close();

			}
		}

	}

}
