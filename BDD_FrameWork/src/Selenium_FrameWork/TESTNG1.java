package Selenium_FrameWork;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TESTNG1 {

	// Sequence of Test Scenarios

	@Test
	public void a3() {
		System.out.println("Hello a3 test method");
	}

	@Test
	public void z() {
		System.out.println("Hello z test method");
	}

	@Test
	public void ab() {
		System.out.println("Hello ab test method");
	}

	@Test
	public void a1() {
		System.out.println("Hello a1 test method");
	}

	@AfterSuite
	public void ac() {
		System.out.println("Hello ac after suite method");
	}

}
