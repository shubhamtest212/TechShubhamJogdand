package Practices_Codes;

public class Constructor_2 {

	int id; // Global variable
	String name; // Global variable
	String address; // Global variable

	// Default Constructor
	Constructor_2() {
		System.out.println("Hello Default Constructor");
	}

	// Parameterized Constructor or constructor overloading
	Constructor_2(int a, String b, String c) {
		id = a;
		name = b;
		address = c;

	}

	// Non-static method
	public void displayInfo() {
		System.out.println(id + " " + name + " " + address);
	}

	public static void main(String[] args) {

		// Default Constructor
		Constructor_2 c2 = new Constructor_2();

		// Parameterized Constructor
		Constructor_2 c3 = new Constructor_2(12, "Shubham", "Jogdand");
		c3.displayInfo();

	}
}
