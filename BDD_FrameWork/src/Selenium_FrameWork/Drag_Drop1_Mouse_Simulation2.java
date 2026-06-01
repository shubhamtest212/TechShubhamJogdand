package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop1_Mouse_Simulation2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(
				"https://www.flipkart.com/account/login?ret=https%3A%2F%2Fwww.flipkart.com%2Ffpg%2Fcbc%2Fsbi%2Fstore-page%3Futm_source%3DGSN_OTA%26utm_context%3DSEM%26cmpid%3Dcontext_23394340014_gmc_pla%26entryMethod%3D23394340014%26gad_source%3D1%26gad_campaignid%3D23394340014%26gbraid%3D0AAAAADxRY58en91QZG_B02gI0vtIHmH-X%26gclid%3DCj0KCQiA7-rMBhCFARIsAKnLKtA8Au3ESlyCk83bOWkmtuTfC9FFbDkLldug1yeCYodigg1t4eIujrcaAt2cEALw_wcB");

		// create electronics web eleement ref
		WebElement electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));

		// Actions class
		Actions act = new Actions(driver);
		act.moveToElement(electronics).build().perform();

		// create men web elements reference
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		act.moveToElement(men).build().perform();
		System.out.println("men option clicked");
		System.out.println(driver.getTitle());

	}

}
