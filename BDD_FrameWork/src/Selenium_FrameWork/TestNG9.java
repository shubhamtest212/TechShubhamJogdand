package Selenium_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG9 {

	// Assert.assertEquals();

	@SuppressWarnings("deprecation")
	@Test
	public void a() {
		int actualInteger = 20;
		int expectedInteger = 2;
		Assert.assertEquals(actualInteger, expectedInteger);
		System.out.println("Hello a test method");
	}

	@Test
	public void b() {
		String actualString = "SHUBHAM";
		String expectedString = "shubham";
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
