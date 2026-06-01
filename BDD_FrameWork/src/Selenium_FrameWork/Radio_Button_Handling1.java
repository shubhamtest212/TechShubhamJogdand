package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button_Handling1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// 1st way for female
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click();

		// 1st way for male
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();

		// 1st way for custom
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();

	}

}
