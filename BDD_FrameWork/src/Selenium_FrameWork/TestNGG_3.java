package Selenium_FrameWork;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGG_3 {

	@Test
	public void a() {
		Assert.assertTrue(20 > 2);
		System.out.println("Hello a test method");
	}

	@Test
	public void b() {
		Assert.assertTrue(20 < 2);
		System.out.println("Hello b test method");
	}

	@Test(dependsOnMethods = { "a", "b" })
	public void c() {
		System.out.println("Hello c test method");
	}

}
