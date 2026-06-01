package com.projectName.pages;

import java.io.IOException;

import com.projectName.genericPage.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() throws IOException {
		super();

	}

	// Click on email field
	public void clickEmail() {
		clickWebElement("Email");
		handleLogger("LoginPage", "Clicked Email Field");

	}

	// Enter email
	public void enterEmail() {
		enterData("Email", "TestData1");
		handleLogger("LoginPage", "Entered Email");
	}

	// Clear email
	public void clearEmail() {
		clearWebElements("Email");
		handleLogger("LoginPage", "Cleared Email");
	}

	// Click on password field
	public void clickPassword() {
		clickWebElement("Password");
		handleLogger("LoginPage", "Clicked Password Field");

	}

	// Enter password
	public void enterPassword() {
		enterData("Password", "TestData2");
		handleLogger("LoginPage", "Entered Password");
	}

	// Clear password
	public void clearPassword() {
		clearWebElements("Password");
		handleLogger("LoginPage", "Cleared Password");
	}

	// Get Facebook Text
	public void getFacebookText() {
		getTextofWebElement("FacebookText");
		handleLogger("LoginPage", "Fetching Facebook Text");

	}

	// Click on login button
	public void clickLoginButton() {
		clickWebElement("LoginButton");
		handleLogger("LoginPage", "Clicked login button");
	}
}
