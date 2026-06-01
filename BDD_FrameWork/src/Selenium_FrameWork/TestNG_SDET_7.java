package Selenium_FrameWork;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNG_SDET_7 {

	@Test
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test
	public void b() {
		System.out.println("Hello b test method");
	}

	@Test
	public void c() {
		System.out.println("Hello c test method");
	}

	@Test
	public void d() {
		int actualResult = 1900;
		int expectedResult = 100;
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Hello d test method");
	}
}
