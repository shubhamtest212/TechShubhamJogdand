package com.projectName.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryLoginPage {

	@FindBy(xpath = "//input[@id='email']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement Password;

	public void enterEmail(String testData) {
		Email.sendKeys(testData);
	}

	public void enterPassword(String testData) {
		Password.sendKeys(testData);
	}

}
