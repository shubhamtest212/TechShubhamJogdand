package Selenium_FrameWork;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGG_5 {

	@Test
	public void a() {
		Assert.assertFalse("shubham" == "SHUBHAM");
		System.out.println("Hello a test method");
	}

	@Test
	public void b() {
		Assert.assertFalse("shubham" == "SHUBHAM");
		System.out.println("Hello b test method");
	}

	@Test
	public void c() {
		Assert.assertFalse("shubham" == "SHUBHAM");
		System.out.println("Hello c test method");

	}

}
