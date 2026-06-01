package Selenium_FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radio_DropDown_ImplictWait2 {

	public static void main(String[] args) {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		// WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the url
		driver.get("https://www.facebook.com");

		// Maximize the screen
		driver.manage().window().maximize();

		// Use explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create new account']"))).click();

		// Custom Radio Button
		List<WebElement> rb1 = driver.findElements(By.xpath("//label[@class=\"_58mt\"]"));
		System.out.println("RadioButton" + rb1.size());
		String optionselected = "Custom";
		for (WebElement element : rb1) {
			if (element.getText().equalsIgnoreCase(optionselected)) {
				element.click();
				System.out.println(optionselected + "clicked");

				WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"preferred_pronoun\"]"));
				Select select1 = new Select(dropdown);
				select1.selectByVisibleText("They: \"Wish them a happy birthday!\"");
				System.out.println(select1.getFirstSelectedOption().getText());
				driver.close();

			}
		}

	}

}
