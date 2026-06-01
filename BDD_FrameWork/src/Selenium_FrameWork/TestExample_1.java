package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExample_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		// Explicit Wait
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id,'_R_1h6kqsqppb6amH1_')]")))
				.sendKeys("shubham");

		driver.findElement(By.xpath("//input[contains(@id,'_R_1h6kqsqppb6amH1_')]")).sendKeys("Shubham");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Jogdand");
		System.out.println(driver.getCurrentUrl());

	}

}
