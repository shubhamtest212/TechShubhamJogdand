package Selenium_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG8 {

	// Assert.assertFalse();

	@Test
	public void a() {
		Assert.assertFalse(3 > 1);
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
