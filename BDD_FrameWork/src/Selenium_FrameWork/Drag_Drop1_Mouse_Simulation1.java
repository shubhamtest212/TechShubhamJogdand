package Selenium_FrameWork;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop1_Mouse_Simulation1 {

	public static void main(String[] args) throws Exception {

		// Looger maintain here to capture log of every actions
		Logger logger = Logger.getLogger("Drag_Drop1_Mouse_Simulation1");

		PropertyConfigurator.configure(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository2/LOG4J.properties");

		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		WebDriver chicken = new ChromeDriver();
		chicken.manage().window().maximize();
		chicken.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		chicken.get(
				"https://www.flipkart.com/account/login?ret=https%3A%2F%2Fwww.flipkart.com%2Ffpg%2Fcbc%2Fsbi%2Fstore-page%3Futm_source%3DGSN_OTA%26utm_context%3DSEM%26cmpid%3Dcontext_23394340014_gmc_pla%26entryMethod%3D23394340014%26gad_source%3D1%26gad_campaignid%3D23394340014%26gbraid%3D0AAAAADxRY58en91QZG_B02gI0vtIHmH-X%26gclid%3DCj0KCQiA7-rMBhCFARIsAKnLKtA8Au3ESlyCk83bOWkmtuTfC9FFbDkLldug1yeCYodigg1t4eIujrcaAt2cEALw_wcB");

		// Create Electronics web element ref
		WebElement Electronics = chicken.findElement(By.xpath("//*[text()='Electronics']"));
		logger.info("clicked on Electronics");

		// Mouse Simulation using Actions class
		Actions act = new Actions(chicken);

		// Mouse hover to electronics
		Thread.sleep(20000);
		act.moveToElement(Electronics).build().perform();

		// Click on Realme
		Thread.sleep(1000);
		chicken.findElement(By.xpath("//*[text()='Realme']")).click();
		logger.info("clicked on Realme");

		// Keyboard Operations
		Thread.sleep(2000);
		WebElement men = chicken.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform();
		logger.info("clicked on Men");

		Thread.sleep(20000);
		WebElement Flights = chicken.findElement(By.xpath("//*[text()='Flights']"));
		act.sendKeys(Flights, Keys.ENTER).build().perform();
		logger.info("clicked on Flights");

		Thread.sleep(10000);
		WebElement offerZone = chicken.findElement(By.xpath("//*[text()='Offer zone']"));
		act.sendKeys(offerZone, Keys.ENTER).build().perform();
		logger.info("clicked on Offer zone");

	}
}
