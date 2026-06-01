package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingDropdown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// 1st-way
		Thread.sleep(1000);
		driver.findElement(By.id("month")).sendKeys("Mar");

		// 2nd-way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total DropDown : " + birthMonth.size());
		birthMonth.get(3).click();
		Thread.sleep(2000);
		birthMonth.get(10);

		// 3rd-way
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		Thread.sleep(200);
		month.selectByVisibleText("Apr");
		Thread.sleep(200);
		month.selectByIndex(2);
		Thread.sleep(200);
		month.selectByValue("11");
		System.out.println(month.getFirstSelectedOption().getText());

		// 4th-way
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total dropdown values 2nd time : " + dropdown.size());
		for (WebElement element : dropdown) {
			if (element.getText().equalsIgnoreCase("Sep")) {
				element.click();
			}
		}

	}

}
