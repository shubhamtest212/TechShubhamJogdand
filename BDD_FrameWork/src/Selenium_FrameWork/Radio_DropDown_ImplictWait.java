package Selenium_FrameWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_DropDown_ImplictWait {

	public static void main(String[] args) throws Exception {

		// Correct Linux ChromeDriver path (no .exe, only /)
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		// Implicit wait it will wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// Radio Button
		List<WebElement> radiobutton1 = driver.findElements(By.xpath("//label[@class=\"_58mt\"]"));
		System.out.println("Radio Buttons : " + radiobutton1.size());
		String expectedResult = "Male";
		for (WebElement element : radiobutton1) {
			if (element.getText().equalsIgnoreCase(expectedResult)) {
				element.click();
				System.out.println(expectedResult + "clicked");

				// Select date of birth for the men
				WebElement Date = driver.findElement(By.xpath("//select[@id=\"day\"]"));
				Select Date1 = new Select(Date);
				Date1.selectByIndex(11);
				System.out.println(Date1.getFirstSelectedOption().getText());
				WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
				Select Month1 = new Select(Month);
				Month1.selectByValue("6");
				System.out.println(Month1.getFirstSelectedOption().getText());
				WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
				Select Year1 = new Select(Year);
				Year1.selectByVisibleText("1999");
				System.out.println(Year1.getFirstSelectedOption().getText());
				driver.close();

			}

		}
	}
}
