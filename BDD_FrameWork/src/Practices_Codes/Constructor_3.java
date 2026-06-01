package Practices_Codes;

public class Constructor_3 {

	// Constructor Overloading
	Constructor_3() {
		System.out.println("No parameter");
	}

	Constructor_3(int n) {
		System.out.println("int parameter");

	}

	Constructor_3(String s) {
		System.out.println("string parameter");
	}

	public static void main(String[] args) {

		Constructor_3 c3 = new Constructor_3(); // No parameter

		Constructor_3 c4 = new Constructor_3(12); // int parameter

		Constructor_3 c5 = new Constructor_3("Shubham"); // string parameter

	}
}
