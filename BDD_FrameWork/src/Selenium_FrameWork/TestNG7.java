package Selenium_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {

	// Assert.assertTrue();

	@Test
	public void a() {
		Assert.assertTrue(3 < 1);
		System.out.println("Hello a test method by using assert");
	}

	@Test
	public void b() {
		Assert.assertTrue(100 == 100);
		System.out.println("Hello b test method by using assert");

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
