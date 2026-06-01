package Selenium_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG10 {

	@Test
	public void a() {
		String actualResult = "Shubham";
		String expectedResult = "Shubham";
		Assert.assertEquals(actualResult, expectedResult);
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
