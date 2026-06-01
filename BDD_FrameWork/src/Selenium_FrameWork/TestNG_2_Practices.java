package Selenium_FrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_2_Practices {

	@Test
	public void a1() {
		System.out.println("Hello a1 test method");
	}

	@Test
	public void a2() {
		System.out.println("Hello a2 test method");

	}

	@Test
	public void B1() {
		System.out.println("Hello b1 test method");
	}

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Hello before suite ");

	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Hello before test ");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Hello before class");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Hello before method");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Hello After suite ");

	}

	@AfterTest
	public void AfterTest() {
		System.out.println("Hello After test ");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("Hello After class");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("Hello After method");
	}
}
