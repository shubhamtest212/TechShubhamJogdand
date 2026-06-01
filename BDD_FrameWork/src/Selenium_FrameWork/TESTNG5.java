package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TESTNG5 {

	// prioritizing test scenarios

	@Test(priority = -4)
	public static void a() {
		System.out.println("Hello a test method");
	}

	@Test(priority = 3)
	public static void b() {
		System.out.println("Hello b test method");
	}

	@Test(priority = 2)
	public static void c() {
		System.out.println("Hello c test method");
	}

	@Test(priority = 1)
	public static void d() {
		System.out.println("Hello d test method");
	}

}
