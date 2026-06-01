package Selenium_FrameWork;

import org.testng.annotations.Test;

// TESTNG : Test Next Generation
// Its is testing framework
// It is advance version of Junit framework
// It is working on the basis of Annotations
// For TestNG need to install TestNG 
// For TestNG need to add external libraries
// TestNG works on the basis of Annotations
// M : Method : @BeforeMethod, @AfterMethod
// C : Class : @BeforeClass, @AfterClass
// G : Groups : @BeforeGroups, @AfterGroups
// S : Suite : @BeforeSuite, @AfterSuite
// T : Test : @BeforeTest, @AfterTest

// @DataProvider : We use it for data parameterization
// @Test : We use it for test script to test scenarios

// TestNG follows order as like
// S : @BeforeSuite, @AfterSuite
// T : @BeforeTest, @AfterTest
// C : @BeforeClass, @AfterClass
// M : @BeforeMethod, @AfterMethod

// For each and every Test scenario beforeMethod and AfterMethod will execute then remaining Test scenarios will execute on same orders

public class TestNG_1_Practices {

	@Test
	public void a() {
		System.out.println("a method");

	}

	@Test
	public void b() {
		System.out.println("b method");
	}

	@Test
	public void c() {
		System.out.println("c method");
	}

}
