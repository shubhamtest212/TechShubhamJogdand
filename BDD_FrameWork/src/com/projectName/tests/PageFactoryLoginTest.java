package com.projectName.tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.projectName.genericPage.CommonMethods;
import com.projectName.pages.PageFactoryLoginPage;

public class PageFactoryLoginTest extends CommonMethods {

	public PageFactoryLoginTest() throws IOException {
		super();

	}

	@Test
	public void loginTest() {
		PageFactoryLoginPage pfc = PageFactory.initElements(driver, PageFactoryLoginPage.class);
		pfc.enterEmail(prop3.getProperty("TestData1"));
		pfc.enterPassword(prop3.getProperty("TestData2"));
	}
}
