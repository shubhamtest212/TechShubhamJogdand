package Selenium_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {

	@Test
	public void a() {
		Assert.assertTrue(3 == 4);
		System.out.println("Hello a test method");
	}

	@Test
	public void b() {
		Assert.assertTrue(3 == 3, "TEST METHOD");
		System.out.println("Hello b test method");
	}

	@Test
	public void c() {
		System.out.println("Hello c test method");
	}

}
