package Selenium_FrameWork;

public class Encapsulation_1 {

	Object inputData; // Global Variable
	final int c = 2; // Final Variable

	public void a() {
		// c = 5; // Final Variable can not change the value
	}

	// final method
	final void d() {
		System.out.println("Hello final method");
	}

	// final method- method overloaded with having same method name but different
	// parameters
	final void d(int a, int b) {
		System.out.println("Hello final overloaded method");

	}

	public void setDetails(Object s) {
		inputData = s;

	}

	public Object getDetails() {
		return inputData;

	}

}
