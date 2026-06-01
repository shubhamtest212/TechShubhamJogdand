package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TESTNG4 {

	// Priority for Test Scenarios

	@Test(priority = -10)
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test(priority = 2)
	public void b() {
		System.out.println("Hello b test method");
	}

	@Test
	public void c() {
		System.out.println("Hello c test method");
	}

	@Test(priority = 0)
	public void d() {
		System.out.println("Hello d test method");
	}

}
