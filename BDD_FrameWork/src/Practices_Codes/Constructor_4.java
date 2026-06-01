package Practices_Codes;

public class Constructor_4 {

	// Default Constructor
	Constructor_4() {
		System.out.println("Hello Default Constructors");
	}

	// Parameterized Constructor
	Constructor_4(int a, int b, int c) {
		System.out.println("Hello Parameterized Constructors");

	}

	// Consttuctor Overloading
	Constructor_4(int x) {
		System.out.println("Hello constructor overloading");

	}

	Constructor_4(String y) {
		System.out.println("Hello constructor overloadingss");

	}

	public static void main(String[] args) {

		Constructor_4 c4 = new Constructor_4();
		Constructor_4 c5 = new Constructor_4(12, 6, 1999);
		Constructor_4 c6 = new Constructor_4(8);
		Constructor_4 c7 = new Constructor_4("Shubham");

	}

}
