package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TESTNG6 {

	@Test
	public void a1() {
		System.out.println("Hello a1 test method");
	}

	@Test
	public void a2() {
		System.out.println("Hello a2 test method");
	}

	@Test
	public void a3() {
		System.out.println("Hello a3 test method");
	}

	@Test(priority = 5)
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test(priority = 1)
	public void b() {
		System.out.println("Hello b test method");
	}

}
