package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TESTNG9 {

	@Test(enabled = false)
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test(invocationCount = 0)
	public void b() {
		System.out.println("Hello b test method");
	}

	@Test
	public void c() {
		System.out.println("Hello c test method");
	}

	@Test(invocationCount = 10)
	public void d() {
		System.out.println("Hello d test method");
	}

}
