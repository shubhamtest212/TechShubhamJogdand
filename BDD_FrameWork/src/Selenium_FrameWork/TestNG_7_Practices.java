package Selenium_FrameWork;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_7_Practices {

	@Test(invocationCount = 10)
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

	@Test(invocationCount = 0)
	public void d() {
		System.out.println("Hello d test method");

	}

	@Test
	public void f() {
		System.out.println("Hello f test method");
		throw new SkipException("Skipping f test method");
	}
}
