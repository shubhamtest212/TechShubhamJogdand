package Selenium_FrameWork;

import java.nio.file.spi.FileSystemProvider;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_004 {

	// @Test - 1st way to skipped the test scenario
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test(enabled = false) // 2nd way to skipped the test scenario in market
	public void b() {
		System.out.println("Hello b test method");
	}

	@Test(enabled = true)
	public void c() {
		System.out.println("Hello c test method");
	}

	@Test(enabled = false)
	public void d() {
		System.out.println("Hello d test method");
	}

	// rerun scenarios multiple times

	@Test(invocationCount = 3)
	public void e() {
		System.out.println("Hello e test method");
	}

	// invocationCount =0 test scenario will by default skipped
	@Test(invocationCount = 0)
	public void f() {
		System.out.println("Hello f test method");
	}

	// conditional skipping
	@Test
	public void g() {
		System.out.println("Hello g test method");
		throw new SkipException("Skipping g test method");

	}
}
