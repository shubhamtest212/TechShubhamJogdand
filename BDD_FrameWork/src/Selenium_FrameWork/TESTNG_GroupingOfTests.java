package Selenium_FrameWork;

// Grouping of test
import org.testng.annotations.Test;

public class TESTNG_GroupingOfTests {

	@Test(groups = "Regression")
	public void a() {
		System.out.println("Hello a test method");
	}

	@Test(groups = "Regression")
	public void b() {
		System.out.println("Hello b test method");
	}

	@Test(groups = "Regression")
	public void c() {
		System.out.println("Hello c test method");
	}

	@Test(groups = "Regression")
	public void d() {
		System.out.println("Hello d test method");
	}

	@Test(groups = { "Regression", "Sanity" })
	public void e() {
		System.out.println("Hello e test method");
	}

	@Test(groups = { "Regression", "Smoke" })
	public void f() {
		System.out.println("Hello f test method");
	}
}
