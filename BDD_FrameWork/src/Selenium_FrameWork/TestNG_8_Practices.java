package Selenium_FrameWork;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_8_Practices {

	@Test(invocationCount = 2)
	public void aMethod() {
		System.out.println("Hello a test method");
		throw new SkipException("Skipping a test method");
	}

	@Test(enabled = false)
	public void bMethod() {
		System.out.println("Hello b test method");
	}

	@Test
	public void cMethod() {
		System.out.println("Hello c test method");
		throw new SkipException("Skipping c test method");
	}

	@Test
	public void dMethod() {
		System.out.println("Hello d test method");
	}

}
