package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TESTNG10 {

	@Test(invocationCount = 0)
	public static void a() {
		System.out.println("Hello a static test method");
	}

	@Test(enabled = false)
	public static void b() {
		System.out.println("Hello b static test method");
	}

	@Test(enabled = false)
	public static void c() {
		System.out.println("Hello c static test method");
	}

	@Test(invocationCount = 1)
	public static void d() {
		System.out.println("Hello d static test method");
	}

}
