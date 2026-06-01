package Selenium_FrameWork;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_SDET_2 {

	@Test
	public void a() {
		System.out.println("Hello a test method");
		throw new SkipException("Skipping a test cases");
	}

	@Test
	public void b() {
		System.out.println("Hello b test method");
		throw new SkipException("Skipping b test cases");
	}

	@Test
	public void c() {
		System.out.println("Hello c test method");
		throw new SkipException("Skipping c test cases");
	}

	@Test
	public void d() {
		System.out.println("Hello d test method");
		throw new SkipException("Skipping d test cases");
	}

}
