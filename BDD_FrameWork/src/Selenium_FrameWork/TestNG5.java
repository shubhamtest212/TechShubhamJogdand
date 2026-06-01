package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TestNG5 {

	@Test
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test(invocationCount = 2, priority = -1, enabled = true & false)
	public void b() {
		System.out.println("Hello b test method");
	}

}
