package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TestNGG_6 {

	@Test(groups = "Regression")
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test(groups = "Sanity")
	public void b() {
		System.out.println("Hello b test method");
	}

	@Test(groups = "Smoke")
	public void c() {
		System.out.println("Hello c test method");
	}

}
