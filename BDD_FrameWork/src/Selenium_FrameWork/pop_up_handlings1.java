package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop_up_handlings1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().deleteAllCookies();
	}
}
//
//		// pop-up handling
//		Thread.sleep(4000);
//		driver.findElement(By.id("messageWindowButton")).click();
//		Set<String> popup = driver.getWindowHandles();
//		System.out.println("POP-UP : " + popup);
//
//		for(String ab : popup) {
//			driver.switchTo().window(ab);
//			if(ab.equalsIgnoreCase(ab))
//		}
//
//	}
//
//}
