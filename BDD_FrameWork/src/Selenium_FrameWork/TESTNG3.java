package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TESTNG3 {

	// Sequencing of Test Scenarios static method nd non-static method

	@Test
	public static void a() {
		System.out.println("Hello a static test method");
	}

	@Test
	public static void b() {
		System.out.println("Hello b static test method");
	}

	@Test
	public static void c() {
		System.out.println("Hello c static test method");
	}

	@Test
	public static void d() {
		System.out.println("Hello d static test method");
	}

	@Test
	public static void a1() {
		System.out.println("Hello a1 static test method");
	}

	@Test
	public void x() {
		System.out.println("Hello a test method");
	}
}
