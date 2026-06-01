package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class class2 {

	WebDriver driver;

	public static void main(String[] args) {
		class2 c1 = new class2();
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		c1.driver.manage().window().maximize();
		c1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c1.driver.get("https://www.facebook.com");
		c1.driver.manage().window().fullscreen();
		c1.driver.switchTo().window("https://www.facebook.com");

	}

}
