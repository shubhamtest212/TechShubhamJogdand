package Selenium_FrameWork;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNG_SDET_Engineer_2 {

	@Test
	public void a() {
		Assert.assertFalse(3 < 10);
		System.out.println("Hello a test method");
	}

	@Test(dependsOnMethods = { "a" })
	public void b() {
		System.out.println("Hello b test method");
	}
}
