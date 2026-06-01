package Practices_Codes;

public abstract class Abstraction1 {

	static int a = 10; // static variable
	int b = 20; // global variable
	final int c = 30; // final variable

	// abstract method
	public abstract void eat();

	// non-abstract method
	public void b() {
		System.out.println("non-abstract method");
	}

}
