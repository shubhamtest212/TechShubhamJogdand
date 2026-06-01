package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();

		// 1st way
		driver.findElement(By.id("month")).sendKeys("Jan");

		// 2nd way
		List<WebElement> monthDropdown = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("List of dropdown : " + monthDropdown.size());
		monthDropdown.get(1);

		// 3rd way
		WebElement monthDropdown1 = driver.findElement(By.xpath("//select[@id='month']/option"));
		Select select = new Select(monthDropdown1);
		select.selectByIndex(1);
		select.selectByValue("Jan");
		select.selectByVisibleText("JAN");

		// 4th way
		List<WebElement> monthDropdowns = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("List of all dropdown : " + monthDropdowns);

		String expResult = "Female";

		for (int i = 0; i < monthDropdowns.size(); i++) {
			if (monthDropdowns.get(i).getText().equalsIgnoreCase(expResult)) {
				monthDropdowns.get(i).click();
				System.out.println(expResult + "clicked");
			}
		}
	}

}
