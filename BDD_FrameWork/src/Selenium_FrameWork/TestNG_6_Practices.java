package Selenium_FrameWork;

import org.testng.annotations.Test;

public class TestNG_6_Practices {

	@Test(enabled = false)
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test(enabled=true)
	public void b() {
		System.out.println("Hello b test method");
	}

	@Test
	public void c() {
		System.out.println("Hello c test method");
	}

	@Test(enabled = false)
	public void d() {
		System.out.println("Hello d test method");
	}

}
