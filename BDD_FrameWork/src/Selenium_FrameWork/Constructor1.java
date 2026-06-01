package Selenium_FrameWork;

public class Constructor1 {

	// Constructor overloading
	Constructor1() {
		System.out.println("No parameter");

	}

	Constructor1(int n) {
		System.out.println("int parameter");

	}

	Constructor1(String s) {
		System.out.println("String parameter");

	}

	public static void main(String[] args) {
		Constructor1 c3 = new Constructor1();
		Constructor1 c4 = new Constructor1(12);
		Constructor1 c5 = new Constructor1("shubham");

	}
}
