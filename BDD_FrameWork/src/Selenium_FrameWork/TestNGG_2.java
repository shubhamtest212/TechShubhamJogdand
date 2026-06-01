package Selenium_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGG_2 {

	@Test()
	public void a() {
		Assert.assertTrue(20 > 2);
		System.out.println("Hello a test method");
	}

	@Test
	public void b() {
		Assert.assertFalse(3 > 30);
		System.out.println("Hello b test method");
	}

	@Test
	public void c() {
		Assert.assertTrue(3 > 12);
		System.out.println("Hello c test method");
	}

	@Test(dependsOnMethods = { "a", "b", "c" })
	public void d() {
		System.out.println("Hello d test method");
	}

	@Test
	public void e() {
		int actualInteger = 20;
		int expectedInteger = 2;
		Assert.assertEquals(actualInteger, expectedInteger);
		System.out.println("Hello e test method");
	}

}
