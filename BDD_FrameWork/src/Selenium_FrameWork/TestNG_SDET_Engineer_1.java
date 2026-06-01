package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TestNG_SDET_Engineer_1 {

	@Test(priority = 4)
	public void aMethod() {
		System.out.println("Hello a test method");
	}

	@Test(priority = 3)
	public void bMethod() {
		System.out.println("Hello b test method");
	}

	@Test(priority = 2)
	public void cMethod() {
		System.out.println("Hello c test method");
	}

	@Test(priority = 1)
	public void dMethod() {
		System.out.println("Hello d test method");
	}

}
