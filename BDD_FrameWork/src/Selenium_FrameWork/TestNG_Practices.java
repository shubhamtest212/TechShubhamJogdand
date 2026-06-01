package Selenium_FrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Practices {

	@Test
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test
	public void b() {
		System.out.println("Hello b test method");
	}

	@Test
	public void c() {
		System.out.println("Hello c test method");
	}

	@BeforeSuite
	public void d() {
		System.out.println("Hello d before suite method");
	}

	@BeforeTest
	public void e() {
		System.out.println("Hello e before test method");
	}

	@BeforeClass
	public void f() {
		System.out.println("Hello f before class method");
	}

	@BeforeMethod
	public void g() {
		System.out.println("Hello g before method");
	}

	@AfterMethod
	public void h() {
		System.out.println("Hello h after method");
	}

	@AfterClass
	public void i() {
		System.out.println("Hello i after class method");
	}

	@AfterTest
	public void j() {
		System.out.println("Hello j after test method");
	}

	@AfterSuite
	public void k() {
		System.out.println("Hello k after suite method");
	}
}
