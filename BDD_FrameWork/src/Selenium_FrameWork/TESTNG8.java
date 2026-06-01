package Selenium_FrameWork;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TESTNG8 {

	// SKIPPING TEST SCENARIOS WITH THE HELP OF CUSTOM EXCEPTION THROW NEW

	@Test
	public void a() {
		System.out.println("Hello a test method");
		throw new SkipException("Skipped a test method");
	}

	@Test
	public void b() {
		System.out.println("Hello b test method");
	}

}
