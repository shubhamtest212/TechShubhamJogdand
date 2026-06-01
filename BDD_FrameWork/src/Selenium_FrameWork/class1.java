package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		// Explicit wait :
		WebDriverWait wt = new WebDriverWait(driver, 40);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("wrong_id"))).sendKeys("test1");
		wt.until(ExpectedConditions.elementToBeClickable(By.name("wrong_name"))).sendKeys("QAEngineer1");

		System.out.print("Shubham");
		System.out.print("Santosh");
		System.out.print("Jogdand");

		System.out.println("Shubham");
		System.out.println("Santosh");
		System.out.println("Jogdand");

	}

}
