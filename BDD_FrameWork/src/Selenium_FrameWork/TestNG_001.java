package Selenium_FrameWork;

import org.testng.annotations.*;

public class TestNG_001 {

	@Test
	public void a2() {
		System.out.println("Hello a2 test method");

	}

	@BeforeTest
	public void b() {
		System.out.println("Hello before test method");
	}

	@BeforeSuite
	public void c() {
		System.out.println("Hello before suite method");
	}

	@AfterMethod
	public void d() {
		System.out.println("Hello After method");
	}

	@BeforeClass
	public void e() {
		System.out.println("Hello before class method");
	}

	@AfterTest
	public void f() {
		System.out.println("Hello After test method");
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
	public void j() {
		System.out.println("Hello after suite method");
	}

	@Test
	public void a1() {
		System.out.println("Hello a1 test method");
	}

	@Test
	public void B1() {
		System.out.println("Hello b test method");
	}

}
