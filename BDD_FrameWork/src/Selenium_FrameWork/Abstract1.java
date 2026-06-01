package Selenium_FrameWork;

public abstract class Abstract1 {

	static int s = 12; // static variable
	int u = 1999; // Global variable
	final int v = 6; // final variable

	// Abstract method
	public abstract void eat(); // Abstract method means no body

	// Non-abstract method
	public void a() {

		System.out.println("non-abstract method");
		System.out.println("Hello SDET Engineer");
		System.out.println("HELLO");
		System.out.println("DONE");
	}
}
