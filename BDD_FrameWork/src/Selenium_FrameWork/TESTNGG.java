package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TESTNGG {

	// Grouping test cases

	@Test(groups = "Regression")
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test(groups = "Regression")
	public void b() {
		System.out.println("Hello b test method");
	}

	@Test(groups = { "Regression", "Sanity" })
	public void c() {
		System.out.println("Hello c test method");
	}

	@Test(groups = { "Regression", "Smoke" })
	public void d() {
		System.out.println("Hello d test method");
	}

	@Test(groups = "Regression")
	public void e() {
		System.out.println("Hello e test method");
	}

	@Test(groups = "Regression")
	public void f() {
		System.out.println("Hello f test method");
	}
}
