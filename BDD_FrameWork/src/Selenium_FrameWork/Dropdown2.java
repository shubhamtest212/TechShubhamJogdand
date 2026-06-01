package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text='Create new account']")).click();

		// Important way to handle dropdown values with the help of select class
		WebElement birthMonths = driver.findElement(By.xpath("//select[@id='month']"));
		Select birth = new Select(birthMonths);
		birth.selectByIndex(2);
		System.out.println(birth.getFirstSelectedOption().getText());
		birth.selectByValue("8");
		System.out.println(birth.getFirstSelectedOption().getText());
		birth.selectByVisibleText("Sep");
		System.out.println(birth.getFirstSelectedOption().getText());

	}

}
