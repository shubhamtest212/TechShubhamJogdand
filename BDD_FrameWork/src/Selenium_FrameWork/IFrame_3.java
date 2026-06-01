package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFrame_3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");

		// Explicit Wait
		WebDriverWait wt = new WebDriverWait(driver, 50);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_2iOZj']"))).click();

		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("All Frames : " + allFrames);

		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String expResult = "Login with your Paytm account";
			String actResult = driver.findElement(By.xpath("//*[text()='Login with your Paytm account']")).getText();

			if (actResult.equalsIgnoreCase(expResult)) {
				System.out.println("Element Found");
			} else {
				System.out.println("Element Not Found");
			}

		}

	}

}
