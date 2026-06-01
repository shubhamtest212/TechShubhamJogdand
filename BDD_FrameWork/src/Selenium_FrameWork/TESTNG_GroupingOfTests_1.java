package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TESTNG_GroupingOfTests_1 {

	@Test(groups = "Regression")
	public void a() {
		System.out.println("a method");
	}

	@Test(groups = "Regression")
	public void b() {
		System.out.println("b method");
	}

	@Test(groups = "Sanity")
	public void c() {
		System.out.println("c method");
	}

}
