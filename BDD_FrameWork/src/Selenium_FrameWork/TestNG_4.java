package Selenium_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_4 {

	@Test(dependsOnMethods = { "b", "c", "d" })
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test
	public void b() {
		int actualResult = 20;
		int expectedResult = 2;
		Assert.assertEquals(actualResult, expectedResult);
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
