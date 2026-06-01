package Selenium_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown_handling_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://eximlogistics.brainbees.com/login");

		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='email'][@type='email']")))
				.sendKeys("shubham.jogdand@firstcry.in");
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password'][@autocomplete='on']")))
				.sendKeys("QAengineer@123");
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='button is-fullwidth']"))).click();
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Import']"))).click();
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Sourcing']"))).click();

		// Dropdown handling
		WebElement dropdown = driver.findElement(By.xpath("control is-fullwidth select"));
		Select select = new Select(dropdown);
		select.selectByIndex(0);
		select.selectByValue("AA WIP");
		select.selectByVisibleText(" Ajay kk ");
		System.out.println(select.getFirstSelectedOption());

	}

}
