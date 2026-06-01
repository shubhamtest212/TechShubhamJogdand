package Selenium_FrameWork;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// S- Suite, T-test, C-class & M-Method

public class TestNG2 {

	@Test
	public void A1() {
		System.out.println("Hello A1 Test");
	}

	@Test
	public void A2() {
		System.out.println("Hello A2 Test");
	}

	@Test
	public void A3() {
		System.out.println("Hello A3 Test");
	}

	@BeforeSuite
	public void a() {
		System.out.println("Hello before suit ");
	}

	@BeforeTest
	public void b() {
		System.out.println("Hello before test");
	}

	@BeforeClass
	public void c() {
		System.out.println("Hello before class");
	}

	@BeforeMethod
	public void d() {
		System.out.println("Hello before method");
	}

}
