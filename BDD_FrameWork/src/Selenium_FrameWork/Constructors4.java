package Selenium_FrameWork;

public class Constructors4 {

	int id; // Global variable
	String name; // Global variable
	String address; // Global variable

	// Default Constructor
	Constructors4() {
		System.out.println("Hello Default Constructor");

	}

	// Parameterized constructor
	Constructors4(int a, String b, String c) {
		id = a;
		name = b;
		address = c;

	}

	// Non-static method
	public void displayInfo() {
		System.out.println(id + "" + name + "" + address);
	}

	public static void main(String[] args) {
		// Dealing with default constructor
		Constructors4 c4 = new Constructors4();
		// Dealing with parameterized constructro
		Constructors4 c5 = new Constructors4(1, "John", "India");
		c5.displayInfo();
		Constructors4 c6 = new Constructors4(2, "SHUBHAM", "TECH");
		c6.displayInfo();

	}
}
