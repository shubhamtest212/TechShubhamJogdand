package Selenium_FrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test
	public void a() {
		System.out.println("Hello a2 test method");
	}

	@BeforeTest
	public void b() {
		System.out.println("Hello before test method");
	}

	@BeforeSuite
	public void c() {
		System.out.println("Hello before Suite method");
	}

	@AfterMethod
	public void d() {
		System.out.println("Hello after  method");
	}

	@BeforeClass
	public void e() {
		System.out.println("Hello before class method");
	}

	@AfterTest
	public void f() {
		System.out.println("Hello after test method");
	}

	@AfterClass
	public void g() {
		System.out.println("Hello after class method");

	}

	@BeforeMethod
	public void h() {
		System.out.println("Hello before method");
	}

	@AfterSuite
	public void i() {
		System.out.println("Hello after suite method");
	}

	@Test
	public void a1() {
		System.out.println("Hello a1 test method");
	}

	@Test
	public void B1() {
		System.out.println("Hello B1 test method");
	}

	@Test
	public void B2() {
		System.out.println("Hello B2 test method");
	}
}
