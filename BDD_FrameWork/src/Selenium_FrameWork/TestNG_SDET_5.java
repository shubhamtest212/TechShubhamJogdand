package Selenium_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_SDET_5 {

	@Test
	public void a() {
		Assert.assertTrue(300 < 100);
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

	@Test(dependsOnMethods = { "a", "b", "c" })
	public void d() {
		System.out.println("Hello d test method");
	}

}
