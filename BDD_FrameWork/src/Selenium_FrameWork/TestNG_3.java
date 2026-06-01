package Selenium_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_3 {

	@Test
	public void a() {
		Assert.assertTrue(3 < 12);
		System.out.println("Hello a test method");
	}

	@Test
	public void b() {
		Assert.assertFalse(3 > 12);
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
		int actText = 1;
		int expText = 2;
		Assert.assertEquals(actText, expText);
		System.out.println("Hello e test method");
	}

}
