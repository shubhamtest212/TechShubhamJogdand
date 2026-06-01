package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFrame_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.paytm.com");

		// Explicit wait
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Sign In']"))).click();

		// find all the present frames on web page
		int allframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println("frames :" + allframe);

		// check if the element is present or not
		for (int i = 0; i < allframe; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String expResult = "Open Paytm App";
			String actResult = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();

			if (actResult.equalsIgnoreCase(expResult)) {
				System.out.println("Element found");
				break;
			} else {
				System.out.println("Element not found");
			}
		}

	}

}
