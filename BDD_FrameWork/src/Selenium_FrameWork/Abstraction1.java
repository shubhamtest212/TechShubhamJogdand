package Selenium_FrameWork;

public abstract class Abstraction1 {

	static int a = 10; // static variable
	int b = 20; // global variable
	final int c = 30; // final variable

	// abstract method - no method body
	public abstract void eat();

	// non-abstract method
	public void a() {
		System.out.println("non-abstract method");

	}

	public static void main(String[] args) {

	}
}
