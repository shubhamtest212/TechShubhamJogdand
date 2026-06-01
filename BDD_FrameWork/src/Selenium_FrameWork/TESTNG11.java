package Selenium_FrameWork;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TESTNG11 {

	@Test
	public void a(int age) {
		age = 20;
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
	public void z() {
		System.out.println("Hello z test method");
		throw new SkipException("z test method skipped here");
	}

}
