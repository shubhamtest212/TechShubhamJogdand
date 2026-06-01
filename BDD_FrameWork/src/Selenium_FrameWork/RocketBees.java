package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RocketBees {

	public static void main(String[] args) throws Exception {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://stage.rocketbees.in/rb_b2c_cms/login");
		Thread.sleep(5000);
//		driver.close();
//		System.out.println("System URL is getting opened");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("fcquickregional@firstcry.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Firstcry@123@");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]']")).click();
		driver.close();
		System.out.println("System URL is getting opened");

	}

}
