package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");

		// DropDown handling
		// 1st way
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("Mar");

		// 2nd way
		List<WebElement> birthMonth = driver.findElements(By.xpath("select[@id='month']/option"));
		System.out.println("Total Months are : " + birthMonth.size());
		birthMonth.get(0); // Jan will be select it will work on the basis of indexing
		birthMonth.get(1); // Feb will be select

		// 3rd way
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select dropdown = new Select(bm);
		dropdown.selectByIndex(1);
		dropdown.selectByValue("Mar");
		dropdown.selectByVisibleText("Mar");
		System.out.println(dropdown.getFirstSelectedOption().getText()); // Last selected value should be print i.e.//
																			// March

		// 4th way
		List<WebElement> dropdown1 = dropdown.getOptions();
		System.out.println("Total DropDown Value 2nd Time : " + dropdown1.size());

		String expResult = "Jan";
		for (int i = 0; i < dropdown1.size(); i++) {
			if (dropdown1.get(i).getText().equalsIgnoreCase(expResult)) {
				dropdown1.get(i).click();

			}
		}

	}

}
