package Selenium_FrameWork;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNG_SDET_6 {

	@Test
	public void a() {
		String actualResult = "SHUBHAM";
		String expectedResult = "shubham";
		Assert.assertEquals(expectedResult, actualResult);
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
		System.out.println("Hello d test method");
	}

}
