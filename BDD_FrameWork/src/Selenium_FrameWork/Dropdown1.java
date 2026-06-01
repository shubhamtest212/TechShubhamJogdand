package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// 1st way
		driver.findElement(By.id("month")).sendKeys("Mar");

		// 2nd way
		List<WebElement> monthDrop = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total Dropdown Values : " + monthDrop.size());
		monthDrop.get(1).click();

		// 3rd way
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
		Select select = new Select(monthDropDown);
		select.selectByIndex(2);
		Thread.sleep(1000);
		select.selectByValue("4");
		Thread.sleep(1000);
		select.selectByVisibleText("Mar");
		System.out.println(select.getFirstSelectedOption().getText());

		// 5th way
		List<WebElement> birthmonth1 = select.getOptions();
		System.out.println("Total birth dropdown values : " + birthmonth1.size());
		for (int i = 0; i < birthmonth1.size(); i++) {
			if (birthmonth1.get(i).getText().equalsIgnoreCase("May")) {
				birthmonth1.get(i).click();
				System.out.println(birthmonth1 + "clicked");

				// 4th way
				List<WebElement> birthMonth1 = driver.findElements(By.xpath("//select[@id='month']/option"));
				System.out.println("Total Birth Drop Down Values  : " + birthMonth1.size());

				String expResult = "Dec";

				for (int a = 0; i < birthMonth1.size(); a++) {
					if (birthMonth1.get(i).getText().equalsIgnoreCase(expResult)) {
						birthMonth1.get(i).click();
						System.out.println(expResult + "clicked");

					}

				}

			}

		}
	}
}
