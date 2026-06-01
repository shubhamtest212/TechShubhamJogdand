package com.projectName.genericPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws IOException { 
		super();

	}

	// get text of web element
	public void getTextofWebElement(String webElementKey) {
		String getTextofWebElement = driver.findElement(By.xpath(prop2.getProperty(webElementKey))).getText();
		System.out.println(getTextofWebElement);

	}

	// click on web element
	public void clickWebElement(String webElementKey) {
		driver.findElement(By.xpath(prop2.getProperty(webElementKey))).click();

	}

	// click list of web element
	public void listWebElement(String webElementKey, String expResult) {
		List<WebElement> listofElements = driver.findElements(By.xpath(prop2.getProperty(webElementKey)));
		for (int i = 0; i < listofElements.size(); i++) {
			if (listofElements.get(i).getText().equalsIgnoreCase(prop3.getProperty(expResult))) {
				listofElements.get(i).click();
			}

		}

	}

	// clear web elements
	public void clearWebElements(String webElementKey) {
		driver.findElement(By.xpath(prop2.getProperty(webElementKey))).clear();
	}

	// enter data
	public void enterData(String webElementKey, String testdata) {
		driver.findElement(By.xpath(prop2.getProperty(webElementKey))).sendKeys(prop3.getProperty(testdata));

	}

	// mouse hover
	public void moveToElement(String webElementKey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(webElementKey))).build().perform();
	}

	// select dropdown value using visible text
	public void selectDropdDown(String webElementKey, String testdata) {
		WebElement dropdown = driver.findElement(By.xpath(prop2.getProperty(webElementKey)));
		Select dropdown1 = new Select(dropdown);
		dropdown1.selectByVisibleText(prop3.getProperty(testdata));

	}

	// read excel data
	public void readExcelData(String webElementKey, int rowNo, int columnNo, String excelSheetName) throws Exception {
		File src = new File(".\\src\\com\\projectName\\resources\\Daily Attendance-Report-12610.xls");
		FileInputStream fis = new FileInputStream(src);

		// Load work book
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// Load work sheet
		XSSFSheet sh = wb.getSheet(prop1.getProperty(excelSheetName));
		String abc = sh.getRow(rowNo).getCell(columnNo).getStringCellValue();
		driver.findElement(By.xpath(prop2.getProperty(webElementKey))).sendKeys(abc);
	}

	// handle explicitwait- elementToBeClickable
	public void handleExplicitWait_elementToBeClickable(String webElementKey, String testdata) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(prop2.getProperty(webElementKey)))).click();

	}

	// Handle Log File
	public void handleLogger(String logClassName, String loggerText) {
		Logger logger = Logger.getLogger(logClassName);
		PropertyConfigurator.configure(prop1.getProperty("log4JPropertiesFileLoc"));
		logger.info(loggerText);
	}

	// Capture ScreenShot
	public void captureScreenshot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {

			// create reference of takesscreenshot interface and typecasting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Use getScreenshotaAs() to capture the screenshot in file format
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			// copy the file to specific location
			File destFolder = new File("./screenshot/" + result.getName() + "png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed, screenshot captured.");

		}
	}

	// Radio button
	public void radioButton(String webElementKey, String testdata) {
		List<WebElement> radios = driver.findElements(By.xpath(prop2.getProperty(webElementKey)));
		System.out.println("Radio Button" + radios.size());

		String expResult = "Female";

		for (int i = 0; i < radios.size(); i++) {
			if (radios.get(i).getText().equalsIgnoreCase(expResult)) {
				radios.get(i).click();

			}
		}

	}

}
