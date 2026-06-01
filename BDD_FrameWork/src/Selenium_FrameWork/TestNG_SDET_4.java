package Selenium_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_SDET_4 {

	@Test
	public void aMethod() {
		Assert.assertTrue(300 > 100);
		System.out.println("Hello a test method");
	}

	@Test
	public void bMethod() {
		System.out.println("Hello b test method");
	}

	@Test
	public void cMethod() {
		System.out.println("Hello c test method");
	}

	@Test(dependsOnMethods = { "a", "b", "c" })
	public void dMethod() {
		System.out.println("Hello d test method");
	}

}
