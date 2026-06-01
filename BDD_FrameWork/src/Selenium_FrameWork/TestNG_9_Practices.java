package Selenium_FrameWork;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_9_Practices {

	@Test
	public void aTest() {
		System.out.println("Hello aTest method");
		throw new SkipException("Hello aTest method");
	}

	@Test
	public void bTest() {
		System.out.println("Hello bTest method");
		throw new SkipException("Hello bTest method");
	}

	@Test
	public void cTest() {
		System.out.println("Hello cTest method");
		throw new SkipException("Hello cTest method");

	}

	@Test
	public void dTest() {
		System.out.println("Hello dTest method");
		throw new SkipException("Hello dTest method");
	}

}
