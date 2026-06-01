package Selenium_FrameWork;

public class Constructor_003 {

	// Constructor Overloading
	Constructor_003() {
		System.out.println("Hello Default Constructor or No parameterized Constructor");

	}

	Constructor_003(int n) {
		System.out.println("Hello int n constructor");

	}

	Constructor_003(String m) {
		System.out.println("Hello int m constructor");

	}

	public static void main(String[] args) {

		// Default Constructor
		Constructor_003 c3 = new Constructor_003();

		// Parameterized Constructor
		Constructor_003 c4 = new Constructor_003(1261999);

		// Parameterized Constructor
		Constructor_003 c5 = new Constructor_003("SHUBHAM");

	}
}
