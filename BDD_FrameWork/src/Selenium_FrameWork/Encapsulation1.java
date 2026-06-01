package Selenium_FrameWork;

public class Encapsulation1 {

	Object inputData; // Global variable
	final int c = 2; // Final variable

	public void a() {
		// c = 5; Final variable can not be change the value
	}

	final void d() {
		System.out.println("Hello final method");

	}

	public void setDetails(Object s) {
		inputData = s;

	}

	public Object getDetails() {
		return inputData;
	}

	public static void main(String[] args) {

	}
}
